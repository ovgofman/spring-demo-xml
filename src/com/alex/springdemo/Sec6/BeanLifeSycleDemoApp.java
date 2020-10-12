package com.alex.springdemo.Sec6;

import com.alex.springdemo.Sec5.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeSycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sec6_48-beanLifeCycle.xml");

        Coach coach = context.getBean("iceSkatingCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
