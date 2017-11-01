package utils;

public class RunningTime {

	long startTime;

	public void startTime() {
		startTime = System.currentTimeMillis();
	}

	public long endTime() {
		return  System.currentTimeMillis();
	}

	public String totalTimeInSec() {
		return ((endTime() - startTime)/1000+" Sec");
	}
	
	public String totalTimeInMin() {
		return ((endTime() - startTime)/60000+" Min");
	}

}
