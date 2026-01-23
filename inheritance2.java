package untitled.src;

public class inheritance2 extends inheritance1
{
    void meth2(){
        System.out.println("child class method");
    }
    public static void main(String[] args) {
        inheritance1 aobj= new inheritance1(); //HAS-A RELATIONSHIP
        aobj.meth1();
      //  aobj.meth2();  compile time error


        System.out.println("-----------------");
        inheritance1 aobj2=new inheritance1();
        aobj2.meth1();
        //aobj2.meth2();  COMPILE TIME ERROR.

        System.out.println("-----------------");
        inheritance2 bobj=new inheritance2();
        bobj.meth1();
        bobj.meth2();

        System.out.println("-----------------");
    //    inheritance2 bobj2=new inheritance1();//INVALID COMPILE TIME ERROR

        inheritance2 bobj3=new inheritance2(); //IS-A RELATIOSHIP
        bobj3.meth1();
    }
}
