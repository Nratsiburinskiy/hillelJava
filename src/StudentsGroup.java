import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentsGroup {
    public static void main(String[] args) {
        Student[] group = new Student[0];
        Student[] another = new Student[0];
        Scanner in = new Scanner(System.in);
        int k = 0;
        String s = "";
        for (; ; ) {
            System.out.println("Please choose what do you want to do((add,print,delete,contains,clear,trim,addmark,addvisit,sort)+another,join,equal,containsall,exit): ");
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
                case "addanother": {
                    another = add(another);
                }
                break;
                case "print":
                    print(group);
                    break;
                case "printanother":
                    print(another);
                    break;
                case "delete":
                    group = delete(group);
                    break;
                case "deleteanother":
                    another = delete(another);
                    break;
                case "contains":
                    if (contains(group)) System.out.println("Yes,there is such student in this group");
                    else System.out.println("No,there is no such student in this group");
                    break;
                case "containsanother":
                    if (contains(another)) System.out.println("Yes,there is such student in this group");
                    else System.out.println("No,there is no such student in this group");
                    break;
                case "clear":
                    group = clear();
                    break;
                case "clearanother":
                    another = clear();
                    break;
                case "trim":
                    group = trim(group);
                    break;
                case "trimanother":
                    another = trim(another);
                    break;
                case "addmark":
                    group = addmark(group);
                    break;
                case "addmarkanother":
                    another = addmark(another);
                    break;
                case "addvisit":
                    group = addvisit(group);
                    break;
                case "addvisitanother":
                    another = addvisit(another);
                    break;
                case "sort":
                    group = sort(group);
                    break;
                case "sortanother":
                    another = sort(another);
                    break;
                case "join":
                    group = join(group, another);
                    break;
                case "equals":
                    if (equals(group, another)) System.out.println("Yes,these groups are equal");
                    else System.out.println("No, these groups aren't equal");
                    break;
                case "containsall":
                    if (containsAll(group, another)) System.out.println("yes,contains");
                    System.out.println("no,doesn't contain");
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
        int i, k = 0;
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
        int k = 0;
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
        int i, n = 0, k = 0;
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

    private static Student[] join(Student[] arr1, Student[] arr2) {
        int i, n = arr1.length, m = arr2.length;
        Student[] join = new Student[n + m];
        for (i = 0; i < n + m; i++) {
            if (i < n) join[i] = arr1[i];
            else join[i] = arr2[i - n];
        }
        return join;
    }

    private static boolean equals(Student[] arr1, Student[] arr2) {
        int i, j, k = 0, n = arr1.length, m = arr2.length;
        boolean f = false;
        if (n == m)
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (arr1[i].surname.equals(arr2[j].surname)) k++;
                }
            }
        if (k == n) f = true;
        return f;
    }

    private static boolean containsAll(Student[] arr1, Student[] arr2) {
        int i, j, k = 0, n = arr1.length, m = arr2.length;
        boolean f = false;
        if (n < m) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    if (arr1[i].surname.equals(arr2[j].surname)) k++;
                }
            }
            if (k == n) f = true;
        } else {
            for (j = 0; j < m; j++) {
                for (i = 0; i < n; i++) {
                    if (arr1[j].surname.equals(arr2[i].surname)) k++;
                }
            }
            if (k == m) f = true;
        }
        return f;
    }

    private static Student[] sort(Student[] arr) {
        Student[] sort = new Student[arr.length];
        String[] words = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            words[i] = arr[i].surname;
        }
        Arrays.sort(words);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(words[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sort[].surname = Arrays.copyOf(words, arr.length);
            for (Student s : arr) {
                if (s.surname.equals(sort[i].surname)) {
                    sort[i].marks = s.marks;
                    sort[i].visits = s.visits;
                }
            }
        }
        return sort;
    }

    static Comparator sorderer = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}

