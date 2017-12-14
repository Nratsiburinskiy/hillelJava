import org.hamcrest.core.IsNull;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    private static Array add (Array or,int i){
        Array add =new Array();int [] b;
        if ()  b=new int[or.arr.length+1];
        else b=new int[1];
        for (int j=0;j<or.arr.length;j++)
        {
            b[j] =or.arr[i];
        }
       b[or.arr.length]=i;
        add.arr=b;
        return add;
    }

    public static void main(String[] args) {
        Array arr = new Array();
        Scanner in = new Scanner(System.in);
        int s=0,k=0;
        System.out.println("Please enter your element");
        while (k == 0) {
            if (!in.hasNextInt()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                s = in.nextInt();
                k = 1;
            }
        }
        add(arr,s);
    }
}
