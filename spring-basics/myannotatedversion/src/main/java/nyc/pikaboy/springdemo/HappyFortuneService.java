package nyc.pikaboy.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class HappyFortuneService implements FortuneService{
    @PostConstruct
    public void startupFunction(){
        System.out.println("Doing Startup");
    }
    @PreDestroy
    public void onDestroy(){
        System.out.println("Doing destroy");
    }

    @Override
    public String getFortuneService() {
        return "This is a happy fortune!";
    }
}
