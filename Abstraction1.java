package untitled.src;

public abstract class Abstraction1 {
    abstract void meth1();
    void meth2(){
        System.out.println("meth2() called");
    }
     static void meth3(){
        System.out.println(" static meth3() called");
    }

    Abstraction1(){
        System.out.println("abstract class constructor ");
    }

    public static void main(String[] args) {
        System.out.println("abstract class main method");
       // Abstraction1 aobj=new Abstraction1() ///it cant be instantiated
        Abstraction1.meth3();

    }


}
