package nyc.pikaboy.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String args[]){
        //first thing is read spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the spring container
        Coach myCoach = context.getBean("tennisCoach", Coach.class);
        Coach nflcoach = context.getBean("myNFLCoach", Coach.class);
        SwimCoach swimcoach = context.getBean("swimCoach", SwimCoach.class);

        //call some methods from the bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(nflcoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(nflcoach.getDailyFortune());
        System.out.println(swimcoach.getEmail());

        //close the context configuration
        context.close();


    }

}
