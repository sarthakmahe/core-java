package untitled.src;

import java.util.Enumeration;
import java.util.Vector;

public class VectorList {
    void meth1(){
        System.out.println("Implementing vector");
      Vector v=new Vector();
      v.add(10);
      v.add("Java");
      v.add(null);
      v.add(75);
      v.add(42);
      v.add(10);
      v.add(12);
      v.add(1);
      System.out.println("vector list : "+v);
        System.out.println("for loop");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("for each");
        for(Object o:v){
            System.out.println(o);
        }
        System.out.println("enumerator interface");
        Enumeration e= v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        v.addElement(5000);
        System.out.println(v);
        v.removeElement(10);
        System.out.println(v);
       v.removeElementAt(3);
        System.out.println(v);

        System.out.println(v.elementAt(3));

        System.out.println(  v.lastElement());

        System.out.println(v.firstElement());
        v.removeAllElements();
        System.out.println(v);
    }

    public static void main(String[] args) {
     new VectorList().meth1();
    }
}
