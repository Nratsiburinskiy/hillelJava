import org.hamcrest.text.IsEmptyString;

class Student {
    String surname = "";
    int[] marks = new int[0];
    boolean[] visits = new boolean[0];
    String getSurname(){
        return surname;
    }
    int compareTo(Student a,Student b){
        return a.surname.compareTo(b.surname);
    }
    //конструктор
}
