package com.java8;

import java.time.*;
import java.util.Date;

public class NewDateDemo {
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);

        LocalDate date=LocalDate.now();
        System.out.println(date);

        date=date.minusDays(3);
        System.out.println(date);

        date = date.plusDays(3);
        System.out.println(date);

        date = date.plusMonths(1);
        System.out.println(date);

        date = date.plusYears(2);
        System.out.println(date);

        boolean leapYear = LocalDate.parse("2020-12-22").isLeapYear();
        System.out.println("Leap Year :: " + leapYear);

        boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
        System.out.println("Before Date : " + before);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = time.plusHours(2);
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        Period period = Period.between(LocalDate.parse("1991-05-20"), LocalDate.now());
        System.out.println(period);

        Period period1=Period.between(LocalDate.parse("2002-05-14"),LocalDate.now());
        System.out.println(period1);

        Duration duration1=Duration.between(LocalTime.parse("06:55"),LocalTime.now());
        System.out.println(duration1);

        Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
        System.out.println(duration);



    }
}
