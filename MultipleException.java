package untitled.src;

import java.util.Scanner;

public class MultipleException {
    void meth1() {
        String s = null;
        System.out.println(10);

        try {
            System.out.println("try block executed");
            System.out.println("Divison" + 20 / 2);   //arithmetic exception
            System.out.println("length " + s.length());//null pointer exception
        }
        /*
        catch(ArithmeticException e)
        {
            System.out.println("1st catch block executed");
            e.printStackTrace();
        }
        catch(NullPointerException e)
        {
            System.out.println("2nd catch block executed");
            e.printStackTrace();
        }
        */
        catch(ArithmeticException | NullPointerException e){
            System.out.println("catch block executed");
            e.printStackTrace();
            //there should not be any parent child relationship in or
        }
        finally {
            System.out.println("finally block always executed");

        }

    }
    public static void main(String[] args){
        new MultipleException().meth1();
    }
}