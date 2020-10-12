package com.alex.springdemo.Sec5;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today's your lucky day";
    }
}
