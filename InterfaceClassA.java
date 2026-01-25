package untitled.src;

public class InterfaceClassA extends InterfaceClassB implements
Interface1,Interface2
{
  public  void meth1(){
     System.out.println("interface 1 abstract method implemented");
  }
  public void show(){
     System.out.println("Inteface 2 abstract method called");
  }

   public static void main(String[] args) {
      Interface1 aobj=new InterfaceClassA();
      aobj.meth1();
      aobj.meth3();   //calling default method
    //  aobj.show();   CE BEACUSE SHOW METHOD BELONGS TO DIFFRENT INTEFACE

  Interface2 bobj=new InterfaceClassA();
  bobj.show();
  new InterfaceClassB().display();




  }


}
