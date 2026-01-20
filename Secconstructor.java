package untitled.src;

public class Secconstructor {
    void meth1(){
        System.out.println("method 1 called");
    }
    void meth2(int a){
        System.out.println("method 2 called"+a);
    }
    Secconstructor(){
        new Secconstructor(1000);
        System.out.println("non parameterised constructor");
        new Secconstructor(999).meth2(500);
    }
    Secconstructor(int a){
        System.out.println("parameterised constructor"+a);
    }

    public static void main(String[] args) {
        System.out.println("start");
        new Secconstructor().meth1();
        System.out.println("end");
    }
}
