import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        System.out.println("Please enter the hight of convert: ");int k=0,n=0,m=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextInt();k=1;
                System.out.println("Your input " + n + " as a hight.");}
        }
        k=0;
        System.out.println("Please enter the width of convert: ");
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {m = in.nextInt();k=1;
                System.out.println("Your input " + m + " as a width.");}
        }
        int i,j;double c,d;c= m;c/=n;d=1/c;
        char[][] arr = new char[n][m];
        for( i=0;i<n;i++){
            for (j=0;j<m;j++){
                if ((i==0)||(i==n-1)||(j==0)||(j==m-1)) arr[i][j]='*';
                else arr[i][j]=' ';
                if (n%2==1){if (m%2==1) arr[n/2][m/2]='*';
                else {arr[n/2][m/2-1]='*';arr[n/2][m/2]='*';}}
                if (Math.abs(j-c*i)<0.0001) arr[i][j]='*';
                if (Math.abs(n-i-(j+1)*d)<0.0001) arr[i][j]='*';
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
