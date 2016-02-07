package zadaci_06_02_2016;
class MyPoint {
//polje podataka
	private int x;
	private int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
//konstruktor sa argumentima
	public MyPoint(int x,int y) {
		this.x = x;
		this.y = y;
	}

	//metoda za racunanje udaljenosti izmeðu taèaka dva objekta
	public double distance(MyPoint a) {
		return Math.sqrt(((a.getX() - x) * ((a.getX() - x))) + ((a.getY() - y) * (a.getY() - y)));
	}

	//metoda za racunanje udaljenosti izmeðu dviju taèaka 
	public double distance(int x1, int y1) {
		return Math.sqrt(((x1 - x) * ((x1 - x))) + ((y1 - y) * (y1 - y)));
	}

	
	public double getX() {
		return x;
	}

	
	public double getY() {
		return y;
	}

}
public class Treci {

	public static void main(String[] args) {
		// Dvije tacke
				MyPoint a = new MyPoint(4, 3);
				MyPoint b = new MyPoint(5, 6);
System.out.println("Razmak izmeðu taèaka: ("+a.getX()+","+a.getY()+") i ("+b.getX()+","+b.getY()+") je: \n"+a.distance(b));



	}

}
