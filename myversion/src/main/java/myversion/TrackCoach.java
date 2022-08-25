package myversion;

public class TrackCoach implements Coach {

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return null;
	}

	public boolean assertWorks(){return false;}

}
