public class ClassA {
    public void meth(){
        System.out.println("meth1() called");
    }

    public static void main(String[] args) {
        //ClassA aobj1=new ClassA();
        //aobj1.meth();             //case1
        new ClassA().meth();      //case2
    }
}
