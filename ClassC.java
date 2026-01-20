public class ClassC {
    public int meth1(int a){
        System.out.println("hi");
        return 100+a;
    }

    public static void main(String[] args) {
      int result= new ClassC().meth1(100);
      //ClassC cobj=new ClassC();
       //int result=cobj.meth1(100);
        System.out.println(result);
    }
}
