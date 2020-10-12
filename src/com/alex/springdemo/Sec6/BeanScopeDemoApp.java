package com.alex.springdemo.Sec6;

import com.alex.springdemo.Sec5.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sec6_43-beanScope.xml");

        Coach coach = context.getBean("iceSkatingCoach", Coach.class);
        Coach alphaCoach = context.getBean("iceSkatingCoach", Coach.class);

        boolean result = (coach == alphaCoach);

        System.out.println(result);
        System.out.println("Memory location: " + coach);
        System.out.println("Memory location: " + alphaCoach);

        context.close();
    }
}
