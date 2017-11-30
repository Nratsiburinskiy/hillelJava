import java.util.Scanner;
import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Please enter your deposit in grivnas:");
        Scanner in = new Scanner(System.in);
        String s=in.next();
        BigDecimal dep= new BigDecimal(s);
        System.out.println("Please enter the percentage of the bank:");
        s=in.next();
        BigDecimal per = new BigDecimal(s);
        System.out.println("Please enter the number of years:");int i,n=0,k=0;
        while (k==0)
        {
            if (!in.hasNextInt()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {n = in.nextInt();k=1;
                System.out.println("Your input " + n + " as a number of years.");}
        }
        BigDecimal bd = new BigDecimal(1);
        BigDecimal d = new BigDecimal(100);
        per= new BigDecimal(String.valueOf((per.divide(d))));BigDecimal nper;
        for (i=1;i<=n;i++){
            dep=dep.multiply((per.add(bd)));
            nper=((per.add(bd)).pow(i)).add(bd.multiply(new BigDecimal(-1)));
            System.out.println("Your deposit per "+i+" year is: "+dep);
            System.out.println("Your percentage is: "+nper.multiply(new BigDecimal(100)));
        }

    }
}