package untitled.src;

public class Interthread {
    int amount=10000; //instance

    synchronized void with_draw(int amount) throws InterruptedException  //15000
    {
        if(this.amount<amount)  //10000<15000
        {
            System.out.println("insufficient balance");
            wait(500000);
            System.out.println("amount credited");
            this.amount=amount;
            System.out.println("withdraw successful \nBalance is "+this.amount);
        }else{
            this.amount-=amount;
            System.out.println("withdraw successful \nBalance is "+this.amount);
        }
    }
    synchronized void deposit(int amount)   //10000
    {
            this.amount+=amount;
            System.out.println("deposit successful \nBalance is "+this.amount);
            notify();
            //notifyAll();
    }

}


