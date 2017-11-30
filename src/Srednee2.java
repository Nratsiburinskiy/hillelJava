import java.util.Scanner;

public class Srednee2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number: ");
        double a=0, b=0,xsred, k=0;
        while (k==0)
        {
            if (!in.hasNextDouble()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {a = in.nextDouble();k=1;
                System.out.println("Your input " + a + " as a first number.");}
        }
        k=0;
        while (k==0)
        {
            if (!in.hasNextDouble()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {b = in.nextDouble();k=1;
                System.out.println("Your input " + b + " as a second number.\n");}
        }
        xsred=(a+b)/2;
        System.out.println("The arithmetic average of two numbers is "+xsred);
    }
}