import java.util.Scanner;

public class SimpleCalc
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number: ");
        double a = in.nextDouble();
        System.out.println("Your input "+a +" as a first number.\n");
        System.out.println("Please input second number: \n");
        double b = in.nextDouble();
        System.out.println("Your input "+b +" as a second number.\n");
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
