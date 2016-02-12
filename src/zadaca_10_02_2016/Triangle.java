package zadaca_10_02_2016;

public class Triangle extends GeometricObject {
double side1=1.0;
double side2=1.0;
double side3=1.0;
	public Triangle() {
		
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public  double getArea(){
		return (1.73/4)*side1*side2;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}

}
