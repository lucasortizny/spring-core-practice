package nyc.pikaboy.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    //create an array of strings
    private String[] data = {
            "You can do this for sure",
            "Watch out for chinese food",
            "The journey is the reward"
    };
    private Random random = new Random();
    @Override
    public String getFortuneService() {
        //choose random string from that array
        int index = random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
