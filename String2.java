package untitled.src;

import java.util.Scanner;

public class String2 {
    public String makeAbba(String a, String b){

       // return a+b+b+a;
        return a.concat(b).concat(b).concat(a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        String a=sc.next();
        System.out.println("enter b: ");
      String b= sc.next();
        String2  aobj=new String2();
        String result=aobj.makeAbba(a,b);
        System.out.println(result);
    }
}
