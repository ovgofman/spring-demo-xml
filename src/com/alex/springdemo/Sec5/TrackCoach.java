package com.alex.springdemo.Sec5;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public TrackCoach() {
        System.out.println("TrackCoach no-arg Constructor");
    }

    public void setEmail(String email) {
        System.out.println("TrackCoach email setter");
        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println("TrackCoach team setter");
        this.team = team;
    }

    public void setFortuneService(HappyFortuneService fortuneService) {
        System.out.println("TrackCoach Setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 2 miles a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "TrackCoach{" +
                "fortuneService=" + fortuneService +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
