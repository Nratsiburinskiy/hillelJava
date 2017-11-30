import java.util.Scanner;

public class SredneeMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);double a=0, b=0,sum=0,xsred, k=0;int i,j,n =0;
        System.out.println("Please tell how many nubmers do you need for arithmetic mean.");
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextInt();k=1;
                System.out.println("Your input " + n + " as an amount of numbers.");}
        }
        double[] arr = new double[n];
        for (i=0;i<n;i++){
            k=0;j=i+1;
            System.out.println("Plese input "+j+" number.");
            while (k==0)
            {
                if (!in.hasNextDouble()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
                else {arr[i] = in.nextDouble();k=1;
                    System.out.println("Your input " + arr[i] + " as a "+j+" number.");}
            }
        }
        for (i=0;i<n;i++) sum += arr[i];
        xsred=sum/n;
        System.out.println("The arithmetic average of your numbers is "+xsred);
    }
}