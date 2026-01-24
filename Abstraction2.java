package untitled.src;

public class Abstraction2 extends Abstraction1{

    @Override     //annotation
    void meth1(){
    System.out.println("abstract method overridden");
}

    public static void main(String[] args) {
        Abstraction1 aobj=new Abstraction2();
        aobj.meth1();   //method overriding
        aobj.meth2();
    }
}
