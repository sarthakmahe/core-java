package untitled.src;

public class Polymorphism1 {
    public final void meth1(){  //0
        System.out.println(10);
    }
   private int meth1(int a){//1[int]
        System.out.println(20);
        return a;
    }
    protected void meth1(int a, int b){//2[int,int]
        System.out.println(30);
    }
    String meth1(String s,int a) {//2[string,int]
        System.out.println(40);
        return s;
    }
    void meth1(int a,String s) {//2[int,string]
        System.out.println(50);
    }

    public static void main(String[] args) {
       Polymorphism1 pobj=new Polymorphism1();
       pobj.meth1();
       pobj.meth1(100);
        pobj.meth1(100,200);
        pobj.meth1("java",2500);
        pobj.meth1(1000,"java");
        System.out.println("-----------------");
        Polymorphism1.main("java");
        Polymorphism1.main(1500);



    }

    public static void main(String s) {
        System.out.println("you fucked up!");
    }

    public static void main(int a) {
        System.out.println("we can overload any method in java");
    }
}
