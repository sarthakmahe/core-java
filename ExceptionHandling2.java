package untitled.src;

import java.util.Scanner;

public class ExceptionHandling2 {
    void meth1(){
        System.out.println(10);
       // Scanner sc=new Scanner(System.in);
        try{
            System.out.println("try block executed");
         //   System.out.println("please enter number");
            System.out.println(20/0);
             //System.out.println(3000); ce
        }
         // System.out.println(3000) ;ce
        catch(ArithmeticException e) //(exception e)
        {
            System.out.println("catch block executed");
           // System.out.println(e.getMessage());// Name of exception
            //get.message ====>>>throwable


            // System.out.println(e.toString());  //Name + Reason for exception
            //toString ====>>>throwable


            e.printStackTrace(); //It will give the complete information about the exception
            //printStackTrace ======>>>>>Throwable[which is HIGHLY RECOMMEND]

        }
        finally
        {
            System.out.println("finally block always executed");

        }
        System.out.println("=====>"+30);
    }

    public static void main(String[] args) {
        new ExceptionHandling2().meth1();
    }
}
