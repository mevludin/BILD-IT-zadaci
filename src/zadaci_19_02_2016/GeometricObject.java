package zadaci_19_02_2016;
//klaca geometric obj kao u knjizi
public class GeometricObject {
	
		//podaci
		private String color = "white";
		private boolean filled;
		private java.util.Date dateCreated;

		// konstruktor 
		public GeometricObject() {
			dateCreated = new java.util.Date();
		}
		// konstruktor
		public GeometricObject(double radius) {
		}
		// konstruktor
		public GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}

		// boja
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		// ako je obojeno
		public boolean isFilled() {
			return filled;
		}

		// set  ako je obojeno
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		// datum
		public java.util.Date getDateCreated() {
			return dateCreated;
		}
		//metoda za površinu
		double getArea() {
			return 0;
		}
		//metoda za površinu
		double getPerimeter() {
		   return 0;
				}
		public String toString() {
			return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

		}
		public int compareTo(GeometricObject o) {
			// TODO Auto-generated method stub
			return 0;
		}


	}

