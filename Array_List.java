package untitled.src;
import java.util.ArrayList;
import java.util.Iterator;

public class Array_List{
    void meth1(){
        System.out.println("implementing ArrayList");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
       // al.add("Java");
     //   al.add(null);
        al.add(75);
        al.add(42);
        al.add(10);
        al.add(12);
        al.add(1);
        System.out.println("array list : "+al);

      System.out.println("size() ==="+al.size());
        System.out.println("isEmpty()====="+al.isEmpty());
/*
        al.clear();
        System.out.println("array list : "+al);
        System.out.println("isEmpty()====="+al.isEmpty()); */

        System.out.println("contains() ===="+al.contains("Java"));
        System.out.println("remove() ====>"+al.remove(5));
        System.out.println("remove() ====>"+al.remove((Object)75));


        al.add(2,100);
        System.out.println(al);

        System.out.println("get()====="+al.get(1));

        System.out.println("accesing from using for loop");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("accessing foreach loop");
        for(int o:al){    //(Integer o:al) (Object o:al)
            System.out.println(o);


            System.out.println("accessing from iterator interface");
            Iterator<Integer> i=al.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
        }
    }
    public static void main(String[] args) {
     Array_List aobj=new Array_List();
              aobj.meth1();
    }
}
//LINKED LIST OCCUPIES MORE MEMORY THAN ARRAY LIST.
//SO CONSTRUCTION TIME MORE FOR LINKED LIST.