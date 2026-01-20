package untitled.src;

public class Constructor {
    void meth1(){
        System.out.println("method 1 called");
    }
    Constructor(){
        System.out.println("non parameterized constructor");
    }
    Constructor(int a){
        System.out.println("parameterized constructor");
    }

    public static void main(String[] args) {
       //Constructor jack=new Constructor(10);
       //jack.meth1();
      //  Constructor jack=new Constructor();
        //jack.meth1();
        new Constructor(20).meth1();
    }
}
