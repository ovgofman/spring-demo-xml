package com.alex.springdemo.Sec5;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for 30 minutes every day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "BaseballCoach{" +
                "fortuneService=" + fortuneService +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
