package myversion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoapp {

    public static void main(String[] args){
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

        //retrieve beans from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach secondCoach = context.getBean("myCoach", Coach.class); //Second one, singleton should make this the same reference.

        //check if these are the same beans. set boolean and compare both object reference. (==)
        System.out.println("Same objects status: " + (theCoach == secondCoach));

        //print out memory location for each one of these.
        System.out.println("Memory location of theCoach: " + theCoach.toString());
        System.out.println("Memory location of secondCoach: " + secondCoach.toString());

        //close the spring container in order to fix memory.

        context.close();

    }

}
