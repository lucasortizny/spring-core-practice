package nyc.pikaboy.springdemo;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortuneService() {
        return "You are not gonna go anywhere in life, sorry bud.";
    }
}
