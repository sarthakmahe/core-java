package untitled.src;

import java.util.Scanner;

public class String4 {
    public String extraEnd(String str){
        String s=str.substring(str.length()-2);
        return s+s+s;
    }
    //extraEnd("hello") //lololo
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
        String4  aobj=new String4();
        String result=aobj.extraEnd(sc.next());
        System.out.println(result);
    }
}
