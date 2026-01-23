package untitled.src;

import java.util.Scanner;

public class Encapsulation2 {
    void display(){
        Scanner sc=new Scanner(System.in);
        Encapsulation1 aobj=new Encapsulation1();

        System.out.println("enter roll number");
       // aobj.studentRollnumber=sc.nextInt();  //compile time error
        aobj.setStudentRollnumber(sc.nextInt());

        System.out.println("enter name: ");
      //  aobj.studentName=sc.next(); //compile time error
        aobj.setStudentName(sc.next());
        System.out.println("student roll number: "+aobj.getStudentRollnumber());
        System.out.println("name: "+aobj.getStudentName());
        sc.close();
    }

    public static void main(String[] args) {

        new Encapsulation2().display();
    }


}
