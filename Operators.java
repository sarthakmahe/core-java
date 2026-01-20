package untitled.src;

public class Operators {
    void meth1(){
        int a=100;
        int b=200;
        System.out.println("sum is: "+(a+b));
    }
    void meth2(int a,int b){
        System.out.println("subtraction is:"+(a-b));
    }
    Operators(){
        System.out.println("multiplication is "+(2*5));
    }
    Operators(int a,int b){
        System.out.println("divison is:"+(a/b));
    }

    public static void main(String[] args) {
        new Operators(20,10).meth2(20,10);
        new Operators().meth1();
    }
}
