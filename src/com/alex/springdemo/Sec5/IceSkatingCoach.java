package com.alex.springdemo.Sec5;

public class IceSkatingCoach implements Coach {
    private FortuneService fortuneService;

    public IceSkatingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public IceSkatingCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice jumps and spins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void initMethod() {
        System.out.println("Inside 'initMethod()'");
    }

    public void destroyMethod() {
        System.out.println("Inside 'destroyMethod()'");
    }
}
