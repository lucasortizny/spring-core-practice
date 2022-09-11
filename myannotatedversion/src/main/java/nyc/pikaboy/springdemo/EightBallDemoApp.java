package nyc.pikaboy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EightBallDemoApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EightBallConfiguration.class);

        Coach poolcoach = context.getBean("poolCoach", Coach.class);

        System.out.println("The coach's daily workout is: " + poolcoach.getDailyWorkout());
        System.out.println("The coach's daily fortune is: " + poolcoach.getDailyFortune());


        //close application context to preserve resources
        context.close();

    }
}
