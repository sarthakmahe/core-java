package untitled.src;

public class ThreadB implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread executed " + i);
        }
    }

    public static void main(String[] args) {

        ThreadA bobj = new ThreadA();
        Thread t1 = new Thread(bobj);
        t1.start();
    }
} 
