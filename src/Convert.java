import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        System.out.println("Please enter the hight of convert: ");int k=0,n=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextInt();k=1;
                System.out.println("Your input " + n + " as a hight.");}
        }
        int i,j;
        char[][] arr = new char[n][n];
        for( i=0;i<n;i++){
            for (j=0;j<n;j++){
                if ((i==0)||(i==n-1)||(j==0)||(j==n-1)||(i==j)||(j+i==n-1)) arr[i][j]='*';
                else arr[i][j]=' ';
            }
        }
        for( i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print(arr[i][j]);
                if (j==n-1) System.out.println();
            }
        }
    }
}
