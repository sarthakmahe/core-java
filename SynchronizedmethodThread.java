package untitled.src;

public class SynchronizedmethodThread extends Thread {
  public void run(){
      criticalresource();
  }
  synchronized void criticalresource(){
      String name=Thread.currentThread().getName();
        System.out.println(name+" has enter the method");
      for(int i=0;i<=5;i++){
          System.out.println(name+ " is executing "+i);
      }
        System.out.println(name+" has completed its execution ");
  }

    public static void main(String[] args) {
        SynchronizedmethodThread aobj=new SynchronizedmethodThread();
       Thread t1=new Thread(aobj);
        Thread t2=new Thread(aobj);
        t1.setName("first thread");
        t2.setName("second thread");

        t1.start();
        t2.start();

    }
}
