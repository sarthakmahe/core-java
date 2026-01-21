package untitled.src;

import java.util.Scanner;

public class String3 {
    public String makeOutWord(String out,String word){
        return out.substring(0,2).concat(word)+out.substring(2);
        //return out.substring(0,2)+word+out.substring(2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1 :");
        String a= sc.next();
        System.out.println("enter string 2 :");
        String b= sc.next();


        String3  aobj=new String3();
        String result=aobj.makeOutWord(a,b);
        System.out.println(result);
    }
}
