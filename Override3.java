package untitled.src;

public class Override3 extends Override2 {
    public Override2 meth1(){   //[public access specifier]
        //private > default > protected > public

        System.out.println("class B method");
        return this;

    }
    static void meth2(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Override2 aobj=new Override3();
        aobj.meth1();
        aobj.meth2();     ///hi  will be because of static method called data hiding
    }

}
