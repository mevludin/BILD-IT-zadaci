package zadaci_05_02_2016;
class Fan {
	//poljee podataka
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on = false;
	private double radius;
	public String color = "blue";

	public Fan() {

	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public int getSpeed() {
		return speed;
	}
//koja je brzina, ako je ukljuèen
	public void setSpeed(int speed) {
		this.speed = speed;
		if (on && speed >= 1 && speed <= 3) {
			if (speed == 1) {
				System.out.println("SLOW");
			} else if (speed == 2) {
				System.out.println("MEDIUM");
			} else if (speed == 3) {
				System.out.println("FAST");

			} else {
				System.out.println("Ukljuèi");
			}
		}
	}
//geteri i seteri
	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}
//to string metoda
	@Override
	public String toString() {
		return "Fan |speed = " + speed + ", on = " + on + ", radius = "
				+ radius + ", color = " + color + "|";
	}
}

	
public class Prvi {

	public static void main(String[] args) {
		//objekat 1
		Fan vent1 = new Fan();
		vent1.setRadius(5);
		vent1.setOn(true);
		vent1.setSpeed(1);
		vent1.setColor("yellow");
		//podaci za ventilator 1
		System.out.println(vent1.toString());
		
		//objekat 2
		Fan vent2 = new Fan();
		vent2.setRadius(5);
		vent2.setSpeed(2);
		vent2.setColor("blue");
		//podaci zaventilator 2
		System.out.println(vent2.toString());

	}

}
