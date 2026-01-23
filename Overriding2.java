package untitled.src;

public class Overriding2 extends Overriding{
   void meth1(){   //method overriding
       System.out.println("class B method");
   }

    public static void main(String[] args) {
       Overriding bobj=new Overriding2(); //child class method
       bobj.meth1();









    //2.    Overriding aobj=new Overriding();  parent class method
      // aobj.meth1();
    }
}



//without using inheritance we cant achieve overriding.