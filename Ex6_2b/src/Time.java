
public class Time {
	private int hour, minute;
	
	public Time() {
		hour = 0;
		minute = 0;
	}
	
	public Time(int hour, int minute) {
		if (Time.isValid(hour, minute) == true) {
			this.hour = hour;
			this.minute = minute;
		}
		else {
			System.out.println("Error: The hour should be 0~23 and the minute should be 0~59.");
		}
	}
	
	public Time(int hour, int minute, boolean isPM) {
		if (isPM == true) {
			this.setTime(hour, minute);
			
			if (hour == 12) {
				this.hour = 0;
			}
			
			else {
				this.hour = hour + 12;
			}
		}
		else {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public String getTime24() {
		String hhmm;
		
		if (this.hour < 10) {
			hhmm = String.format("%02d%02d", this.hour, this.minute);
		}
		else {
			hhmm = String.format("%d%02d", this.hour, this.minute);
		}
		return hhmm;
	}
	
	public String getTime12() {
		String am = "am";
		String pm = "pm";
		String hhmm = "";
		
		if (this.hour > 12) {
			hhmm = String.format("%d:%02d %s", (this.hour-12), this.minute, pm);
		}
		else if (this.hour <= 12) {
			if (this.hour == 12) {
				hhmm = String.format("%d:%02d %s", this.hour, this.minute, pm);
			}
			else {
				hhmm = String.format("%d:%02d %s", this.hour, this.minute, am);
			}
		}
		return hhmm;
	}
	
	public static boolean isValid(int hour, int minute) {
		return (((hour >= 0) && (hour <= 23)) && ((minute >= 0) && (minute <= 59)));
	}
	
	public void setTime(int hour, int minute) {
		if (Time.isValid(hour, minute) == true) {
			this.hour = hour;
			this.minute = minute;
		}
		
		else {
			System.out.println("Error: The hour should be 0~23 and the minute should be 0~59.");
		}
		
	}
	
	public void setTime2(int hour, int minute, boolean isPM) {
		if (isPM == true) {
			this.setTime(hour, minute);
			
			if (hour == 12) {
				this.hour = 12;
			}
			
			else {
				this.hour = hour + 12;
			}
		}
		else {
			this.hour = hour;
			this.minute = minute;
		}
		
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	

}
