package untitled.src;

import java.util.Scanner;

public class String1 {

    public String helloname(String name){

        return "hello ".concat(name).concat("!");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");



        String1  aobj=new String1();
       String result=aobj.helloname(sc.next());
        System.out.println(result);
    }
}
