class ListElement<E> {
    ListElement next;
    ListElement prev;
    E data;
}

class LinkedList<E> {
    private ListElement head;
    private ListElement tail;

    void addFront(E data){
        ListElement a= new ListElement();
        a.data=data;
        if (head==null){
        head=a;
        tail=a;
        }
        else {
            a.next=head;
            head.prev=a;
            head=a;
        }
    }
    void addBack(E data){
        ListElement a =new ListElement();
        a.data=data;
        if(tail==null){
            head=a;
            tail=a;
        }
        else {
            tail.next=a;
            a.prev=tail;
            tail=a;
        }
    }
    void printList() {
        ListElement t =head;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    void delEl(E data){
        if (head==null){
            return;
        }
        if (head==tail&&head.data.equals(data)){
            head=null;
            tail=null;
            return;
        }
        if (head.data.equals(data)){
            head.next.prev=null;
            head=head.next;
            return;
        }
        ListElement t =head;
        while (t.next!=null){
            if (t.next.data.equals(data)){
                if (tail==t.next){
                    t.next.prev=null;
                    t.next=null;
                    tail=t;
                }
                else {
                    t.next=t.next.next;
                    t.next.prev=t;
                }
                return;
            }
            t=t.next;
        }
    }
}
