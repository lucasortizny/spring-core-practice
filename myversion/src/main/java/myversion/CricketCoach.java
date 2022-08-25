package myversion;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    public CricketCoach(){
        System.out.println("Cricket-coach: inside no-arg constructor");
    }
    public String getDailyWorkout() {
        return null;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public boolean assertWorks() {
        return false;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
