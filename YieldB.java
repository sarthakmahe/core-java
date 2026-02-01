package untitled.src;

public class YieldB {
    public static void main(String[] args) {
        YieldA aobj = new YieldA();
        aobj.start();
       Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println("class B");
        }
    }
}