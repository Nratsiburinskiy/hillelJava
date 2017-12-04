import java.util.Scanner;
public class IfBelongtoRect {
    public static void main(String[] args) {
        System.out.println("Please enter the coordinates of left upper corner(x,y): ");long xl=0,yl=0,xr=0,yr=0,x=0,y=0,k=0;
        Scanner in = new Scanner(System.in);
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {xl = in.nextLong();k=1;}
        }
        k=0;
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {
                yl = in.nextLong();k=1;
                System.out.println("Your input (" + xl +","+yl+") as left upper coordinates.");
            }
        }
        k=0;
        System.out.println("Please enter the coordinates of rigft lower corner(x,y): ");
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {xr = in.nextLong();k=1;}
        }
        k=0;
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {
                yr = in.nextLong();k=1;
                System.out.println("Your input (" + xr +","+yr+") as right lower coordinates.");
            }
        }
        k=0;
        System.out.println("Please enter the coordinates of your dot(x,y): ");
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {x = in.nextLong();k=1;}
        }
        k=0;
        while (k==0)
        {
            if (!in.hasNextLong()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {
                y = in.nextLong();k=1;
                System.out.println("Your input (" + x +","+y+") as coordinates of your dot.");
            }
        }
        if ((x>=xl)&&(y<=yl)&&(x<=xr)&&(y>=yr)) System.out.println("Your dot belongs to rectangular.");
        else System.out.println("Your dot doesn't belong to rectangular.");
    }
}
