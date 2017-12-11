import java.util.Arrays;
import java.util.Scanner;

public class StudentsGroup {
    public static void main(String[] args) {
        Student[] group = new Student[0];
        Scanner in = new Scanner(System.in);
        int k = 0;
        String s = "";
        for (; ; ) {
            System.out.println("Please choose what do you want to do(add,print,delete,contains,clear,trim,addmark,addvisit,exit): ");
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
                    group = add(group);
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
                    group = clear();
                    break;
                case "trim":
                    group = trim(group);
                    break;
                case "addmark":
                    group = addmark(group);
                    break;
                case "addvisit":
                    group = addvisit(group);
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
                addstudent[arr.length] = new Student();
                addstudent[arr.length].surname = in.next();
                k = 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i].surname.equals(addstudent[arr.length].surname)) {
                System.out.println("There is already such student in the group");
                return arr;
            }
        }
        return addstudent;
    }

    private static void print(Student[] arr) {
        for (Student s : arr
                ) {
            if (s.surname.isEmpty()) System.out.println("There is no studens in group");
            else {
                System.out.print(s.surname + " marks: " + Arrays.toString(s.marks) + " visits: ");
                if (s.visits.length != 0) {
                    for (int i = 0; i < s.visits.length; i++) {
                        if (s.visits[i]) System.out.print("+");
                        else System.out.print("-");
                    }
                }
                System.out.println("");
            }
        }
    }


    private static Student[] delete(Student[] arr) {
        Student[] delete = new Student[arr.length - 1];
        System.out.println("Inpute surname of the student you want to delete: ");
        Scanner in = new Scanner(System.in);
        int i , k = 0;
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
            if ((!((arr[i].surname).equals(s))) && (n == 0)) {
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
        if ((arr.length == 1) && (arr[0].surname).equals(s)) n = 1;
        if (n == 0) System.out.println("There is no such student " + s);
        if (n == 1) {
            return delete;
        } else return arr;
    }

    private static boolean contains(Student[] arr) {
        System.out.println("Please inpute surname of student you are looking: ");
        int  k = 0;
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
        return new Student[0];
    }

    private static Student[] trim(Student[] arr) {
        int k = 0, n = 0;
        for (Student s : arr) {
            if ((s.surname).equals("")) k++;
        }
        Student[] trim = new Student[arr.length - k];
        for (int i = 0; i < arr.length - k; i++) {
            if (((arr[i].surname).equals(""))) {
                n++;
                trim[i] = arr[i + n];
            } else trim[i] = arr[i + n];
        }
        return trim;
    }

    private static Student[] addmark(Student[] arr) {
        System.out.println("Please enter surname of the student you want to mark: ");
        int i , n = 0, k = 0;
        Scanner in = new Scanner(System.in);
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
        for (i = 0; i < arr.length; i++) {
            if (arr[i].surname.equals(s)) {
                System.out.println("Please enter your mark");
                while (k == 1) {
                    if (!in.hasNextInt()) {
                        System.out.println("Input is not correct,try harder");
                        in = new Scanner(System.in);
                    } else {
                        int[] m;
                        m = Arrays.copyOf(arr[i].marks, arr[i].marks.length + 1);
                        m[arr[i].marks.length] = in.nextInt();
                        arr[i].marks = m;
                        k = 0;
                    }
                }
            } else n++;
            if (n == arr.length) System.out.println("No such student.");
        }
        return arr;
    }

    private static Student[] addvisit(Student[] arr) {
        System.out.println("Please enter surname of the student you want to acknowledge the presence of:");
        int i, n = 0, k = 0;
        boolean f = false;
        Scanner in = new Scanner(System.in);
        String s = "", l;
        while (k == 0) {
            if (!in.hasNext()) {
                System.out.println("Input is not correct,try harder");
                in = new Scanner(System.in);
            } else {
                s = in.next();
                k = 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i].surname.equals(s)) {
                System.out.println("Please enter his presence(+,-)");
                while (k == 1) {
                    if (!in.hasNext()) {
                        System.out.println("Input is not correct,try harder");
                        in = new Scanner(System.in);
                    } else {
                        boolean[] m;
                        m = Arrays.copyOf(arr[i].visits, arr[i].visits.length + 1);
                        l = in.next();
                        if (l.equals("+")) {
                            f = true;
                            k = 0;
                        }
                        if (l.equals("-")) {
                            f = false;
                            k = 0;
                        }
                        m[arr[i].visits.length] = f;
                        arr[i].visits = m;
                    }
                }
            } else n++;
            if (n == arr.length) System.out.println("No such student.");
        }

        return arr;
    }
}

