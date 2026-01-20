public class ClassD {
    int meth1(int a,int b){
        System.out.println(50);
        ClassD dobj=new ClassD();
        System.out.println(45);
        int x=dobj.meth2(100,"java");
        System.out.println(x+1);

        return a+b;
    }
    int meth2(int a,String s){
        System.out.println(a+a);
        System.out.println(65);
        System.out.println(s);
        return a;

    }

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(new ClassD().meth1(10,20)+100);
        System.out.println("end");
    }
}
