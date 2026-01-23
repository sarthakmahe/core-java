package untitled.src;

import java.util.Scanner;

public class Encapsulation3 {
    void display(){
        Scanner sc=new Scanner(System.in);
       Encapsulation4 aobj=new Encapsulation4();
        System.out.println("enter your name: ");
        aobj.setEmpName(sc.next());
        System.out.println("enter your id: ");
        aobj.setEmpId(sc.nextInt());
        System.out.println("enter your salary: ");
        aobj.setEmpSal(sc.nextInt());
        System.out.println("enter your dept: ");
        aobj.setEmpDept(sc.next());
        System.out.println("enter your address: ");
        aobj.setEmpAdd(sc.next());

        System.out.println("name: "+aobj.getEmpName());
        System.out.println("id: "+aobj.getEmpId());
        System.out.println("salary: "+aobj.getEmpSal());
        System.out.println("department: "+aobj.getEmpDept());
        System.out.println("address: "+aobj.getEmpAdd());


    }

    public static void main(String[] args) {
       Encapsulation3 bobj=new Encapsulation3();
       bobj.display();
    }
}
