import java.util.Scanner;

public class SimpleCalc
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number: ");
        double a = 0;double k=0;
        while (k==0)
        {
            if (!in.hasNextDouble())  {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {a = in.nextDouble();k=1;
            System.out.println("Your input " + a + " as a first number.");}
        }

        System.out.println("Please input second number: ");
        double b = 0; k=0;
        while (k==0)
        {
            if (!in.hasNextDouble())  {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else
                {b = in.nextDouble(); if (b!=0)
            {k=1; System.out.println("Your input " + b + " as a second number.");}
                else System.out.println("Second number can't be 0");}
        }
        System.out.println("Your");
        double sum = a+b;
        System.out.println("Sum is "+sum);
        double dif = a-b;
        System.out.println("Difference is "+dif);
        double mul = a*b;
        System.out.println("Multiplication is "+mul);
        double div = a/b;
        System.out.println("Division is "+div);
    }
}
