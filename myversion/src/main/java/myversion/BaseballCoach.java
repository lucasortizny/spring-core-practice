package myversion;

public class BaseballCoach implements Coach{
	// for dependency injection, create a private field for the fortune
	private FortuneService fortuneService;
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public boolean assertWorks() { return true;}
	// for dependency injection, create a constructor that can inject the appropriate information.
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	//add an init method
	public void doMyStartupStuff(){
		System.out.println("Initializing the baseball coach");
	}
	//add a destroy method
	public void doMyDestroyStuff(){
		System.out.println("Destroying the baseball coach");
	}


}
