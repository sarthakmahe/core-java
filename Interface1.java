package untitled.src;

public interface Interface1 {
   void meth1();
   static void meth2(){
      System.out.println("i am static method in interface from 1.8v");
   }
   default void meth3(){
      System.out.println("i am default method in interface from 1.8v");
      this.meth4();//to call private method
   }
   private void meth4(){
      System.out.println("i am private method in interface from 1.9v");
   }

   public static void main(String[] args) {
       Interface1.meth2();
   }
}
