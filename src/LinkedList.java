import java.util.Collection;
import java.util.Iterator;

class ListElement {
    ListElement next;
    ListElement prev;
    Object data;
}

class LinkedList implements Collection {
    private ListElement head;
    private ListElement tail;
    int size=0;

    void addFront(Object data){
        ListElement a= new ListElement();
        a.data=data;
        size++;
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
    void printList() {
        ListElement t =head;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    void delEl(Object data){
        if (head==null){
            return;
        }
        if (head==tail&&head.data.equals(data)){
            head=null;
            tail=null;
            size--;
            return;
        }
        if (head.data.equals(data)){
            head.next.prev=null;
            head=head.next;
            size--;
            return;
        }
        ListElement t =head;
        while (t.next!=null){
            if (t.next.data.equals(data)){
                if (tail==t.next){
                    t.next.prev=null;
                    t.next=null;
                    tail=t;
                    size--;
                }
                else {
                    t.next=t.next.next;
                    t.next.prev=t;
                    size--;
                }
                return;
            }
            t=t.next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public boolean contains(Object o) {
        ListElement t =head;boolean f=head.equals(o);
        while (t.next!=null){
            if (t.next.data.equals(o)) f=true;
            t=t.next;
        }
        return f;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {

        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        ListElement a =new ListElement();
        a.data=o;
        size++;
        if(tail==null){
            head=a;
            tail=a;
        }
        else {
            tail.next=a;
            a.prev=tail;
            tail=a;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (head==null){
            return true;
        }
        if (head==tail&&head.data.equals(o)){
            head=null;
            tail=null;
            size--;
            return true;
        }
        if (head.data.equals(o)){
            head.next.prev=null;
            head=head.next;
            size--;
            return true;
        }
        ListElement t =head;
        while (t.next!=null){
            if (t.next.data.equals(o)){
                if (tail==t.next){
                    t.next.prev=null;
                    t.next=null;
                    tail=t;
                    size--;
                }
                else {
                    t.next=t.next.next;
                    t.next.prev=t;
                    size--;
                }
                return true;
            }
            t=t.next;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] array =c.toArray();
        for(Object o:array)this.add(o);
        return false;
    }

    @Override
    public void clear() {
    this.head.next=null;
    this.head.prev=null;
    this.head.data=null;
    this.tail=head;
    size=0;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] array = c.toArray();
        for (Object o :array) this.remove(o);
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        if (this.head==null) return false;
        Object[] array = c.toArray();
        for(Object o:array){
            if (!this.contains(o)) return false;
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
