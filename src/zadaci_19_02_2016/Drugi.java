package zadaci_19_02_2016;
class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	// podaci
	double width = 1;
	double height = 1;

	//konstruktor
	Rectangle() {
	}
	//konstruktor
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	// površina
	double getArea() {
		return Math.ceil(width * height);
	}

	//obim
	double getPerimetar() {
		return (2 * width) + (2 * height);
	}

	@Override
	public String toString() {
		return "Pravougaonik širok=" + width + ", visok=" + height;
	}

	// ako je objekat jednak površini - true
	@Override
	public boolean equals(Object obj) {
		if (obj.equals(getArea())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Rectangle o) {
		return 0;
	}

}
public class Drugi {

	public static void main(String[] args) {
		// objekti
				Rectangle pravoug1= new Rectangle(4, 6);
				Rectangle pravoug2 = new Rectangle(4, 6);
				// prints if they are equal
				System.out.println(pravoug1.equals(pravoug2));

	}

}
