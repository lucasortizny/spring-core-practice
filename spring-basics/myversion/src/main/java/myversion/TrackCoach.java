package myversion;

public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return null;
	}

	public boolean assertWorks(){return false;}

}
