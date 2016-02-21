package zadaci_19_02_2016;
class Class extends GeometricObject implements Comparable<GeometricObject> {
	double polupr;

	
	Class() {
	}

	

	public Class(double polupr) {
		this.polupr = polupr;
	}



	// površina
	double getArea() {
		return polupr * polupr * Math.PI;
	}

	// geteri i seteri

	public double getPolupr() {
		return polupr;
	}



	public void setPolupr(double polupr) {
		if (polupr >= 0) {
		this.polupr = polupr;
		}
	}

	// provjera jednakosti
	@Override
	public boolean equals(Object obj) {

		if (obj.equals(polupr)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Circle [Area " + getArea() + "]";
	}

	@Override
	public int compareTo(GeometricObject o) {
		return 0;
	}

}
public class Prvi {
	
		public static void main(String[] args) {
			// krugovi
					Class krug1 = new Class(4);
					Class krug2 = new Class(8);
					// taèno ili netaèno
					System.out.println(krug1.equals(krug2));

	}

}
