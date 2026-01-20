package untitled.src;

public class looping {
    void meth1(int a){
        System.out.println("------meth1 called--");
        while(a<=10){
            System.out.println("a value is "+a);
            a++;
        }
        System.out.println("meth1 executed");

    }
    void meth2(int a){
        System.out.println("---meth2 called--");
        while(a<=20)
           // int x=90; declarative statements are not allowed
            System.out.println("a value is"+a);
             a++;
        System.out.println("meth2() executed");
    }
    void meth3(int a){
        System.out.println("--meth3() called");
        while(true){
            System.out.println("a value is"+a);
            a++;
        }
        //System.out.println("method 3 executed");//because it is unreachable code
    }
    void meth4(int a){
        System.out.println("meth4 called");
        do{
            System.out.println("a value is:"+a);
            a++;
        }while(a<=10);
        System.out.println("method 4 executed");

    }
    void meth5(int a){
        System.out.println("meth5 called");
        //a+=;
        while(a<=5);
    }
//there should be any statements between do while
    public static void main(String[] args) {
        looping lobj=new looping();
        //lobj.meth1(1);
        // lobj.meth2(15);//it generate a infinite loop
       // lobj.meth3(1);
  //      lobj.meth3(5);
//        lobj.meth3(1);//it generate an infinite loop

    }
}
