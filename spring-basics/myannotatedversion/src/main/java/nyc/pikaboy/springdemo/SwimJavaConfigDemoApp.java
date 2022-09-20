package nyc.pikaboy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the spring container

        SwimCoach swimcoach = context.getBean("swimCoach", SwimCoach.class);

        //call some methods from the bean

        System.out.println(swimcoach.getDailyFortune());

        //close the context configuration
        context.close();
    }
}
