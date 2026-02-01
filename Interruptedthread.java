package untitled.src;

public class Interruptedthread implements Runnable{
    public void run() {
        System.out.println("I am ready to goto inteviews");

        for (int i = 0; i <= 5; i++) {
            System.out.println("this is my"+i+" interview");
        }
        System.out.println("i got selected & i can relax");
    try{
        Thread.sleep(5000);
    }catch(Exception e){
        System.out.println("someone disturbed my sleep");
    }
        System.out.println("time to go to office");
    }

    public static void main(String[] args) {
        Interruptedthread aobj=new Interruptedthread();
        Thread t=new Thread(aobj);
        t.start();
        t.interrupt();
    }
}
