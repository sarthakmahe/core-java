package untitled.src;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListt {
    void meth1(){
        System.out.println("linked list");
        LinkedList l1=new LinkedList();
       l1.add(10);
        l1.add("Java");
        l1.add(null);
        l1.add(75);
        l1.add(42);
        l1.add(10);
        l1.add(12);
        l1.add(1);
        System.out.println(l1);

        ListIterator li=l1.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+" " );
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.removeFirst());
        System.out.println(l1.removeLast());
        System.out.println(l1);
        l1.addFirst(5);
        System.out.println(l1);
        l1.addLast(100);
        System.out.println(l1);

    }

    public static void main(String[] args) {
        new LinkedListt().meth1();
    }
}
//LINKED LIST OCCUPIES MORE MEMORY THAN ARRAY LIST.
//SO CONSTRUCTION TIME MORE FOR LINKED LIST