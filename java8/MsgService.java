package com.java8;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user id:");
        int userId=sc.nextInt();

        User u=new User();
      /*  String userName=u.getUsernameById(userId);
       if(userName!=null) {
           String msg = userName.toUpperCase() + ", hello";
           System.out.println(msg);
       }else{
           System.out.println("invalid id");
       }
       */
       Optional<String> username= u.getUsername(userId);
      if(username.isPresent()) {
          String name = username.get();
          System.out.println(name.toUpperCase() + ", Hello");
      }else{
          System.out.println("No data found");
      }

    }
}
