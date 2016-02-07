package zadaci_06_02_2016;

class Time {
	// polje podataka
	private long hour;
	private long minute;
	private long second;
	private java.util.Date datum;

	// konstruktor
	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	// no arg konstruktor
	public Time() {
		datum = new java.util.Date(System.currentTimeMillis());
		this.hour = datum.getHours();
		this.minute = datum.getMinutes();
		this.second = datum.getSeconds();
	}

	// konstruktor sa argumentima
	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// metoda postavka vremena
	public void setTime(long elapseTime) {
		datum = new java.util.Date(elapseTime);
		this.hour = datum.getHours();
		this.minute = datum.getMinutes();
		this.second = datum.getSeconds();
	}

	// geteri i seteri
	public long getHour() {
		return hour;
	}

	public void setHour(long hour) {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(long minute) {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	// metoda override
	@Override
	public String toString() {
		return " sati = " + hour + ", minute = " + minute + ", sekunde = "
				+ second;
	}
}

public class Prvi {
	// test unos vremena i ispis vremena
	public static void main(String[] args) {
		Time time1 = new Time(555550000);
		Time time2 = new Time();

		System.out.println("Vrijeme 1 : " + time1.toString());
		System.out.println("Vrijeme 2 : " + time2.toString());
	}

}
