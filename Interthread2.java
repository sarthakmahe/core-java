package untitled.src;

public class Interthread2 {
    public static void main(String[] args) {
        Interthread aobj=new Interthread();   //creating an object for class F
        new Thread()
        {
            public void run()
            {
                try{
                    aobj.with_draw(15000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            public void run(){
                aobj.deposit(10000);
            }
        }.start();
    }
}
