package untitled.src;

import org.w3c.dom.ls.LSOutput;

public class SwitchCase {
    void meth1(int num1,int num2, char operator){
        System.out.println("takes three inputs and perform opeartion");
        switch (operator){
            case '+':
                System.out.println("addition is "+(num1+num2));
                break;
            case '-':
                System.out.println("subtraction is "+(num1*num2));
                break;
            case '*':
                System.out.println("multiplication is "+(num1*num2));
                break;
            case '/':
                System.out.println("div is "+(num1/num2));
                break;
            default:
                System.out.println("invalid operator");
        }
    }
    public static void main(String[] args) {
    new SwitchCase().meth1(100,20,'%') ;
    }
}
