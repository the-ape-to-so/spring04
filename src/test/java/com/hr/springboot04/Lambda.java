package com.hr.springboot04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lambda {
    public static void main(String[] args) {
        Person p=()-> System.out.println("萨瓦迪卡");
        p.sayHi();
        LocalDate date=LocalDate.now();
        System.out.println("当前日期"+date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
 interface Person{
   void sayHi();
}
