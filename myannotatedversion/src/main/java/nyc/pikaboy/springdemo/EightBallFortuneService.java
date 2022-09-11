package nyc.pikaboy.springdemo;

public class EightBallFortuneService implements FortuneService{

    @Override
    public String getFortuneService() {
        return "This is not an 8-ball!";
    }
}
