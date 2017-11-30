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
        while (k==0) {
            if (!in.hasNextDouble()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                b = in.nextDouble();k++;
                System.out.println("Your input " + b + " as a second number.");
            }
        }
        System.out.println("Please input operation(+,-,*,/)");
            String c = in.next();k=0;
        while (k==0){
            switch (c) {
                case "+": {
                    System.out.println("Your");
                    double sum = a + b; k++;
                    System.out.println("Sum is " + sum);
                    break;
                }
                case "-": {
                    System.out.println("Your");
                    double dif = a - b; k++;
                    System.out.println("Difference is " + dif);
                    break;
                }
                case "*": {
                    System.out.println("Your");
                    double mul = a * b; k++;
                    System.out.println("Multiplication is " + mul);
                    break;
                }
                case "/": {
                    if (b != 0) {
                        System.out.println("Your");
                        double div = a / b; k++;
                        System.out.println("Division is " + div);
                    } else {System.out.println("Second number can't be zero"); k++;}
                    break;
                }
                default:
                {
                    System.out.println("Input is not correct,try harder");c = in.next();
                }
        }
        }




    }
}
