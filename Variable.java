package untitled;

public class Variable {
    int a;//instance
    static int b=20;//static
    int m=99;   //instance
    static int n=100;
    void meth1(){
        int m=999;
        System.out.println("defualt value of instance variable "+a);
        System.out.println("local variable value m "+m);
        System.out.println("instance value of m "+new Variable().m);
        System.out.println("static variable method 1:"+b);
        System.out.println("second way:"+new Variable().b);
        System.out.println("third way:"+Variable.b);
    }

    public static void main(String[] args) {
        new Variable().meth1();
    }
}
