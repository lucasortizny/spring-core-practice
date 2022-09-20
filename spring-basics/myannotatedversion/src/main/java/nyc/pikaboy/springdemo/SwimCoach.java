package nyc.pikaboy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim one thousand meters as a warm up!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
