package nyc.pikaboy.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EightBallConfiguration {

    @Bean
    public Coach poolCoach(){
        return new PoolCoach(eightBallFortuneService());
    }
    @Bean
    public FortuneService eightBallFortuneService(){
        return new EightBallFortuneService();
    }



}
