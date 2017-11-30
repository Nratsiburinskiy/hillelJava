import java.util.Scanner;
public class IfEven {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");int k=0;long n=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextLong();k=1;
                System.out.println("Your input " + n + " as your number.");}
        }
        if (n%2==0) System.out.println("Your number is even");
        else System.out.println("Your number is odd");
    }
}