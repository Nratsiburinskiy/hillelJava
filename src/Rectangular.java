import java.util.Scanner;
public class Rectangular {
    public static void main(String[] args) {
        System.out.println("Please enter the hight of rectangular: ");int k=0,n=0,m=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextInt();k=1;
                System.out.println("Your input " + n + " as a hight.");}
        }
        System.out.println("Please enter the hight of rectangular: ");k=0;
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {m = in.nextInt();k=1;
                System.out.println("Your input " + m + " as a width.");}
        }
        int i,j;
        char[][] arr = new char[n][m];
        for( i=0;i<n;i++){
            for (j=0;j<m;j++){
                if ((i==0)||(i==n-1)||(j==0)||(j==m-1)) arr[i][j]='*';
                else arr[i][j]=' ';
            }
        }
        for( i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(arr[i][j]);
                if (j==m-1) System.out.println();
            }
        }
    }

}
