package zadaca_10_02_2016;

public class Test1 {

		public static void main(String[] args) {
			//kreiramo objekat tipa geometric Object, testiramo funkcije
			GeometricObject object = new GeometricObject();
			System.out.println("A object " + object.toString());
			System.out.println("The color is " + object.getColor());
			System.out.println("The object is filled " + object.isFilled());
			
			Triangle triangle = new Triangle();
			System.out.println("\nA triangle " + triangle.toString());
		    System.out.println("The area is " + triangle.getArea());
			System.out.println("The perimeter is " +
					triangle.getPerimeter());
			}

		
	

}
