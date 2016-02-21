package zadaci_19_02_2016;


public class Treci extends GeometricObject implements Cloneable {
//podaci
	private double s;

	// konstruktor
	public Treci() {

	}
	
	// konstruktor 
		public Treci( double s) {
			this.s = s;
		}

	// konstruktor 
	public Treci(String color, boolean filled, double s) {
		super(color, filled);
		this.s = s;
	}

	// metoda koja vraca velicinu stranica
	public double getS() {
		return s;
	}

	// metoda koja postavlja velicinu stranica
	public void setS(double s) {
		this.s = s;
	}

	// metoda povrsina osmougla
	@Override
	public double getArea() {
		return (2 * (1 + Math.sqrt(2)) * s * s);
	}

	// metoda za obim
	@Override
	public double getPerimeter() {
		return 8 * s;
	}

	// metoda uporedi
	@Override
	public int compareTo(GeometricObject o) {
		int r = 0;
		if (o instanceof Treci) {
			if (this.getArea() > ((Treci) o).getArea()) {
				r = 1;
				System.out.println("Prvi je veci.");
			} else if (this.getArea() < ((Treci) o).getArea()) {
				r = -1;
				System.out.println("Drugi je veci.");
			} else {
				r = 0;
				System.out.println("Jednaki su.");
			}
		}
		return r;
	}
	
	//  metoda kloniranje
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
