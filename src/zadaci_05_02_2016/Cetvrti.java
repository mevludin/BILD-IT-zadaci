package zadaci_05_02_2016;
class LinearEquation{
	//polje podataka
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	//konstruktor sa svim podacima
	public LinearEquation(int a, int b, int c, int d, int e, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	//geteri i seteri
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	//ako je jednaèina rješiva vraæa true
	public boolean isSolvable(){
		return(((a*d) - (b*c))!=0);	
	}
	//rjesenje jednacine x
	public double getX(){
		if(isSolvable()){
			return ((e * d)- (b * f)) / (( a * d) - (b * c));
		}else{
			System.out.println("Jednacina nema rijesenje");
			return 0;
		}
	}
	//rjesenje jednacine v
	public double getY(){
		if(isSolvable())
			return ((a * f) - (e * c))/((a * d) - (b * c));
		else{
			System.out.println("jednacina nema rijesenje");
			return 0;
		}
	}
	
}

public class Cetvrti {

	public static void main(String[] args) {
		//definisemo jdnacine i upisujemo nepoznate
		LinearEquation jednacina1 = new LinearEquation(1,2,3,4,5,6);
		LinearEquation jednacina2 = new LinearEquation(10,9,8,7,6,5);
		System.out.println("Prva jednacina:");
		//pozivamo metodu za rjesenje jednacine
		System.out.print("\nRijesenje x = "+jednacina1.getX()+"  y = "+jednacina1.getY());
		System.out.println("\n\nDruga jednacina:");
		System.out.print("\nRijesenje x = "+jednacina2.getX()+"  y = "+jednacina2.getY());


	}

}
