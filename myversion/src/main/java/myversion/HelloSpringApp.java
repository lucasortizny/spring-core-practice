package myversion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Maven packages for import is spring-core and spring-context
 * I need to check out more of these packages to see what falls where. 
 * @author lucas
 *
 */
public class HelloSpringApp {

	private static void getAllFiles(File curDir) {

		File[] filesList = curDir.listFiles();
		for(File f : filesList){
			if(f.isDirectory())
				System.out.println(f.getName());
			if(f.isFile()){
				System.out.println(f.getName());
			}
		}

	}
	public static void main(String[] args) {
		//load the spring configuration file
		File curDir = new File(".");
		HelloSpringApp.getAllFiles(curDir);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrive bean from spring container
		/**
		 * Essentially this code below takes the myCoach bean defined in the ClassPathXmlApplicationContext
		 * and essentially binds it to the interface defined in Coach.class. This was the bean is flexible...
		 * 
		 */
		CricketCoach advcoach = context.getBean("myModifiedCricketCoach", CricketCoach.class);


		//call methods on the bean
		System.out.println("The email address is: " + advcoach.getEmailAddress());
		System.out.println("The team is: " + advcoach.getTeam());


		//close the context later cuz we testing
		context.close();
		//Test if this thing works...

	}

}
