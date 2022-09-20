package myversion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main (String[] args){
        //load the configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
        //create a bean and get it from the context (only one though)
        Coach mycoach = context.getBean("myCoach", Coach.class);

        //close the context for good
        System.out.println("Closing the context now...");
        context.close();

    }

}
