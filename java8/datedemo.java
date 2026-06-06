package com.java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class datedemo {
    public static void main(String[] args) throws Exception {
        Date date =new Date();
        System.out.println(date);


        //convert date to string
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String format=sdf.format(date);
        System.out.println(format);

        SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
        String format2=sdf2.format(date);
        System.out.println(format2);

        //convert string ton date
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate=sdf3.parse("2022-12-20");
        System.out.println(parsedDate);

        java.sql.Date d=new java.sql.Date(20021405);
        System.out.println();
    }
}
