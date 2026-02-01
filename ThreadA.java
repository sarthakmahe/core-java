package untitled.src;

public class ThreadA extends Thread {
public void run() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("thread executed "+i);
    }
}
    

    public static void main(String[] args) {
      ThreadA aobj=new ThreadA();  //class object
       Thread t1=new Thread(aobj);
       t1.start();
    }
}
