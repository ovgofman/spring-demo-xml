package com.alex.springdemo.Sec5;

public class MyApp {
    public static void main(String[] args) {
        Coach baseballCoach = new IceSkatingCoach();
        System.out.println(baseballCoach.getDailyWorkout());
    }
}
