import java.util.Scanner;

public class StudentsGroup {
    public static void main(String[] args) {
        Student[] group = new Student[0];
        Scanner in = new Scanner(System.in);
        int k = 0;
        String s = "";
        for (; ; ) {
            System.out.println("Please choose what do you want to do(add,print,delete,contains,clear,prim,exit): ");
            while (k == 0) {
                if (!in.hasNext()) {
                    System.out.println("Input is not correct,try harder");
                    in = new Scanner(System.in);
                } else {
                    s = in.next();
                    k = 1;
                }
            }
            k = 0;
            switch (s) {
                case "add": {
                    group=add(group);
                }
                break;
                case "print":
                    print(group);
                    break;
                case "delete":
                    group = delete(group);
                    break;
                case "contains":
                    if (contains(group)) System.out.println("Yes,there is such student in this group");
                    else System.out.println("No,there is no such student in this group");
                    break;
                case "clear":
                    group=clear();
                    break;
                case "exit":
                    k = 1;
                    break;
                default: {
                    System.out.println("Input is not correct,try harder");
                    break;
                }
            }
            if (k == 1) break;
        }
    }

    private static Student[] add(Student[] arr) {
        Student[] addstudent = new Student[arr.length + 1];
        System.out.println("Inpute new studen's surname: ");
        Scanner in = new Scanner(System.in);
        int i, k = 0;
        for (i = 0; i < arr.length; i++) addstudent[i] = arr[i];
        while (k == 0) {
            if (!in.hasNext()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                addstudent[arr.length] =new Student();
                addstudent[arr.length].surname = in.next();
                k = 1;
            }
        }
        return addstudent;
    }

    private static void print(Student[] arr) {
        for (Student s : arr
                ) {
            if (s.surname.isEmpty()) System.out.println("There is no studens in group");
            else
                System.out.println(s.surname);
        }
    }

    private static Student[] delete(Student[] arr) {
        Student[] delete = new Student[arr.length - 1];
        System.out.println("Inpute surname of the student you want to delete: ");
        Scanner in = new Scanner(System.in);
        int i = 0, k = 0;
        String s = "";
        while (k == 0) {
            if (!in.hasNext()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                s = in.next();
                k = 1;
            }
        }
        int n = 0;
        for (i = 0; i < arr.length - 1; i++) {
            if ((!((arr[i].surname).equals(s)))&&(n==0)) {
                delete[i] = arr[i];
            }
            if ((arr[i].surname).equals(s)) {
                n = 1;
                delete[i] = arr[i + 1];
            }
            if (n == 1) {
                delete[i] = arr[i + 1];
            }
        }
        if ((arr.length==1)&&(arr[0].surname).equals(s)) n=1;
        if (n == 0) System.out.println("There is no such student " + s);
        if (n == 1) {
            return delete;
        } else return arr;
    }

    private static boolean contains(Student[] arr) {
        System.out.println("Please inpute surname of student you are looking: ");
        int i = 0, k = 0;
        Scanner in = new Scanner(System.in);
        String s = "";
        boolean f = false;
        while (k == 0) {
            if (!in.hasNext()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                s = in.next();
                k = 1;
            }
        }
        for (Student a : arr) {
            if ((a.surname).equals(s)) f = true;
        }
        return f;
    }

    private static Student[] clear() {
        Student[] c = new Student[0];
        return c;
    }

    private static Student[] prim(Student[] arr) {
        int k = 0, n = 0;
        for (Student s : arr) {
            if (s.equals("")) k++;
        }
        Student[] prim = new Student[arr.length - k];
        for (int i = 0; i < arr.length - k; i++) {
            if ((arr[i].equals(""))) {
                n++;
                prim[i] = arr[i + n];
            } else prim[i] = arr[i + n];
        }
        return prim;
    }

    private static int[][] studentmark(int[][] arr) {
        int[][] studentmark = new int[arr.length + 1][];
        return studentmark;
    }

    private static int[][] addmark(String[] student, int[][] arr) {
        int[][] addmark = new int[arr.length][];
        System.out.println("Please enter which student do you want to mark?");
        Scanner in = new Scanner(System.in);
        int i, k = 0;
        String s = "";
        while (k == 0) {
            if (!in.hasNext()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                s = in.next();
                k = -1;
            }
        }
        for (i = 0; i < student.length; i++) {
            if (student[i].equals(s)) {
                k = i;
            }
        }
        return addmark;
    }
}

