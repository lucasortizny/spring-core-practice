package nyc.pikaboy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myNFLCoach")
public class FootballCoach implements Coach{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "win the NFL";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
