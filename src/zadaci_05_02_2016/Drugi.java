package zadaci_05_02_2016;
class RegularPolygon{
	//polje podataka
	public int n=3;
	public double side=1;
	public double x=0;
	public double y=0;
	public double perimeter;
	public double area;
	//konstruktor bez argumenata
	public RegularPolygon() {
	}
	
	//konstruktor sa dva argumenta	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
//konstruktor sa svim argumentima
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

//geteri i seteri
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	//raèunanje obima
	public double getPerimeter() {
		perimeter=n*side;
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	//raèunanje površine
	public double getArea() {
		area = n*(side*side)/4*Math.tan(Math.PI/n);
		return area;
	}
	public void setArea(double area) {
		
		this.area = area;
	}
	
	
}
public class Drugi {

	public static void main(String[] args) {
		//objekti
		RegularPolygon poligon = new RegularPolygon();
		RegularPolygon poligon1 = new RegularPolygon(6, 4);
		RegularPolygon poligon2 = new RegularPolygon(10,4, 5.6, 7.8);
		//ispis traženih velièina
		System.out.printf("Poligon 1 : povrsina  "+poligon.getArea()+" obim "+poligon.getPerimeter());
		System.out.printf("\nPoligon 2 : povrsina  "+poligon1.getArea()+" obim "+poligon1.getPerimeter());
		System.out.printf("\nPoligon 3 : povrsina  "+poligon2.getArea()+" obim "+poligon2.getPerimeter());
	}

	}


