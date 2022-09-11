package nyc.pikaboy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PoolCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public PoolCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "This is the workout!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
