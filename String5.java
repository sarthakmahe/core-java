package untitled.src;

import java.util.Scanner;

public class String5 {
        public String firstTwo(String str){
           if((str.length()==1 ||str.length()==1)){
               return str;
           }
            return str.substring(0,2);
}              //hello---->he
               //abcdefg--->ab

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
        String5  aobj=new String5();
        String result=aobj.firstTwo(sc.next());
        System.out.println(result);
    }
}
