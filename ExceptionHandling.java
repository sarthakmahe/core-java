package untitled.src;

import java.util.Scanner;

public class ExceptionHandling {
    void meth1(){
        System.out.println(10);
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("try block executed");
            System.out.println("please enter number");
            System.out.println(20/sc.nextInt());
        }
        catch(ArithmeticException e)
        {
            System.out.println("catch block executed");
        }
        finally
        {
            System.out.println("finally block always executed");
            sc.close();
        }
        System.out.println("=====>"+30);
    }

    public static void main(String[] args) {
        new ExceptionHandling().meth1();
    }
}
