import java.util.Scanner;
public class StudentsGroup {
    public static void main(String[] args) {
        String [] surname = new String[0];
        int[][] marks = new int[0][];
        boolean[][] attendance = new boolean[0][];
        Scanner in = new Scanner(System.in); int k=0;String s="";
        for (;;)
        {
            System.out.println("Please choose what do you want to do(add,print,delete,contains,clear,prim,exit): ");
            while (k==0)
            {
                if (!in.hasNext()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
                else {s = in.next();k=1;}
            }
            k=0;
            switch (s){
                case "add": {surname=addstudent(surname);marks=studentmark(marks);}break;
                case "print": print(surname);break;
                case "delete": surname=delete(surname);break;
                case "contains": if (contains(surname)) System.out.println("Yes,ther is such student.");
                   else System.out.println("No,there is no such student");break;
                case "clear": clear(surname);break;
                case "prim": surname=prim(surname);break;
                case "exit": k=1;break;
                default: {System.out.println("Input is not correct,try harder");break;}
            }
            if (k==1) break;
        }
    }
    private static String[] addstudent(String[] arr)
    {
        String [] addstudent = new String[arr.length+1];
        System.out.println("Inpute new studen's surname: ");
        Scanner in = new Scanner(System.in);int i,k=0;
        for (i=0;i<arr.length;i++) addstudent[i]=arr[i];
        while (k==0)
        {
            if (!in.hasNext()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {addstudent[arr.length] = in.next();k=1;}
        }
        return addstudent;
    }
    private static void print(String[] arr)
    {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    private static String[] delete(String[] arr)
    {
        String[] delete = new String[arr.length-1];
        System.out.println("Inpute surname of the student you want to delete: ");
        Scanner in = new Scanner(System.in);int i=0,k=0;String s ="";
        while (k==0)
        {
            if (!in.hasNext()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {s = in.next();k=1;}
        }
        int n=0;
        for (i=0;i<arr.length-1;i++)
        {
            if (!(arr[i].equals(s))) {delete[i]=arr[i];}
            if (arr[i].equals(s))
            {
                n=1;delete[i]=arr[i+1];
            }
            if (n==1) {delete[i]=arr[i+1];}
        }
        if (n==0) System.out.println("There is no such student "+s);
        if (n==1) {return delete;} else return arr;
    }
    private static boolean contains(String[] arr)
    {
        System.out.println("Please inpute surname of student you are looking: ");
        int i=0,k=0; Scanner in = new Scanner(System.in);String s="";boolean f=false;
        while (k==0)
        {
            if (!in.hasNext()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {s = in.next();k=1;}
        }
        for (String a:arr) {
        if (a.equals(s)) f=true;
        }
        return f;
    }
    private static void clear(String[] arr)
    {
        int i;
        for (i=0;i<arr.length;i++) {
            arr[i]="";
        }
    }
    private static String[] prim(String[] arr)
    {
        int k=0,n=0;
        for (int i=0;i<arr.length;i++) {if (arr[i].equals("")) k++;}
        String [] prim =new String[arr.length-k];
        for (int i=0;i<arr.length-k;i++)
        {
            if ((arr[i].equals(""))) {n++;prim[i]=arr[i+n];}
            else prim[i]=arr[i+n];
        }
        return prim;
    }
    private static int[][] studentmark(int[][] arr)
    {
        int [][] studentmark = new int[arr.length+1][];
        return studentmark;
    }
    private static int[][] addmark(String[] student,int[][] arr)
    {
        int[][] addmark = new int[arr.length][];
        System.out.println("Please enter which student do you want to mark?");
        Scanner in = new Scanner(System.in);int i,k=0;String s ="";
        while (k==0)
        {
            if (!in.hasNext()) {System.out.println("Input is not correct,try harder");in = new Scanner(System.in);}
            else {s = in.next();k=-1;}
        }
        for (i=0;i<student.length;i++)
        {
            if (student[i].equals(s)) {k=i;}
        }
        return addmark;
    }
}

