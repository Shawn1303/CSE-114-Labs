
public class Time {
	private int hours;
    private int minutes;
    private int seconds;
    
    public Time() {
    	this.hours = 0;
    	this.minutes = 0;
    	this.seconds = 0;
    }
    
    public Time(int hours, int minutes, int seconds) {
    	this.hours = hours;
    	this.minutes = minutes;
    	this.seconds = seconds;
    }
    
    public void getTime() {
    	System.out.println("Time is " + this.hours + ":" + this.minutes + ":" + this.seconds);
    }
    
    public void tick() {
    	this.seconds++;
    	if(this.seconds == 60) {
    		this.minutes++;
    		this.seconds = 0;
    	}
    	if(this.minutes == 59) {
    		this.hours++;
    		this.minutes = 0;
    	}
    	if(this.hours == 24) {
    		this.hours = 0;
    	}
    }
    
    public void add(int seconds) {
    	int totalAdd = seconds, hoursAdd, minutesAdd, secondsAdd;
    	hoursAdd = totalAdd / 3600;
    	totalAdd %= 3600;
    	minutesAdd = totalAdd / 60;
    	totalAdd %= 60;
    	secondsAdd = totalAdd;
    	this.hours += hoursAdd;
    	this.minutes += minutesAdd;
    	this.seconds += secondsAdd;
    }
}
