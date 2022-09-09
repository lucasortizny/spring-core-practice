package nyc.pikaboy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args){
        //load spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotatedConfigurationClass.class);
        //retrieve bean from spring container

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphacoach = context.getBean("tennisCoach", Coach.class);

        //check to see if they are the same object
        boolean result = (coach == alphacoach);
        System.out.println("The objects are equal? " + result);
        System.out.println("Coach memory location is " + coach.toString());
        System.out.println("Alphacoach memory location is " + alphacoach.toString());

        //close the context
        context.close();


    }
}
