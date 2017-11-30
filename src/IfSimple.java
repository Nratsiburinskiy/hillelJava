import java.util.Scanner;
public class IfSimple {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");int k=0;long n=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextLong();k=1;
                System.out.println("Your input " + n + " as your number.");}
        }
        if (prime(n)) System.out.println("Your nuber is prime");
        else System.out.println("Your nuber is not prime");

    }

    private static boolean prime(long x) {
        long i;boolean m=true;
        for (i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0) m=false;
            else { m=true;break;}
        }
        return m;
    }
}