import java.util.Scanner;

public class LinkApp {
    public static void main(String[] args) {
        LinkedList ml = new LinkedList();
        ml.addBack(1.0);
        ml.addBack(2);
        ml.addBack("brrr");
        ml.addFront(6);



        ml.printList();
        System.out.println();

        ml.delEl(6);
        ml.delEl(1.0);
        ml.delEl(12);
        ml.delEl(2);

        ml.printList();
        System.out.println();
    }
}
