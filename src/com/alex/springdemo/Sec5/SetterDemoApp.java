package com.alex.springdemo.Sec5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach trackCoach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());
        System.out.println(trackCoach.toString());
        context.close();

    }
}
