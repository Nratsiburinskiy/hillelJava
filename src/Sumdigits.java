import java.util.Scanner;
public class Sumdigits {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");long a,sum=0,n=0,k=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextLong();k=1;
                System.out.println("Your input " + n + " as your number.");}
        }
        for (k=n;k>=1;k/=10) {
            a=k%10;sum+=a;
        }
        System.out.println("The sum of digits in your number is "+sum);
    }

}
