
public class StepTracker {
	private int minSteps;
	private int totalSteps;
	private int[] stepsRecorded;
	
	public StepTracker(int minSteps) {
		this.minSteps = minSteps;
		this.totalSteps = 0;
		this.stepsRecorded = new int[0];
	}
	
	public void addDailySteps(int stepsAdded) {
		this.totalSteps += stepsAdded;
		int[] temp = new int[this.stepsRecorded.length + 1];
		for(int i = 0; i < this.stepsRecorded.length; i++) {
			temp[i] = this.stepsRecorded[i];
		}
		temp[this.stepsRecorded.length] = stepsAdded;
		this.stepsRecorded = temp;
	}
	
	public int activeDays() {
		int active = 0;
		for(int steps: this.stepsRecorded) {
			if(steps >= this.minSteps) {
				active++;
			}
		}
		return active;
	}
	
	public double averageSteps() {
		if(this.stepsRecorded.length == 0) return 0;
		else {
			double days = this.stepsRecorded.length;
			return this.totalSteps/days;
		}
	}
}
