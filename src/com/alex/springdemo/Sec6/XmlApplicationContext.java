package com.alex.springdemo.Sec6;

import com.alex.springdemo.Sec5.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("iceSkatingCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}
