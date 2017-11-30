import java.util.Scanner;
public class IfMultiple {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");int k=0;long n=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextLong();k=1;
                System.out.println("Your input " + n + " as your number.");}
        }
        multiple(n);
    }

    private static void multiple(long x) {
        long i;
        for (i=1;i<=(x);i++)
        {
            if(x%i==0) System.out.println("Your number is multiple to "+i);
        }
    }
}