public class ClassB {
    void meth1(int a){
        System.out.println(a);
    }
    void meth2(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        ClassB bobj=new ClassB();
        bobj.meth1(100);
        bobj.meth2("java");
        new ClassB().meth1(100);
        new ClassB().meth2("java");

    }
}
