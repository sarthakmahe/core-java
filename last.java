package untitled;

public class last {
    String meth1(int a, int b){
        System.out.println(10);
        System.out.println((54+a)-b);
        int value=new last().meth5();
        System.out.println(value);
        return "java";
    }
    int meth2(int a){
        System.out.println(75);
        int b=5;
        System.out.println(b-a);
        return (5*5)-b;
    }
    void meth3(){
        System.out.println("start");
        System.out.println(new last().meth4());
        System.out.println(40);
    }
    String meth4(){
        System.out.println("today is unlucky day");
        return new last().meth1(4,8);
    }
    int meth5(){
        last obj=new last();
        System.out.println(99);
        return obj.meth2(5);

    }

    public static void main(String[] args) {
        last lobj=new last();
        lobj.meth3();
    }
}
//start today is unlucky day 10 50 99 75 0 20 java 40