package nyc.pikaboy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myNFLCoach")
public class FootballCoach implements Coach{
    private FortuneService fortuneService;
    @Autowired
    public FootballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "win the NFL";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
