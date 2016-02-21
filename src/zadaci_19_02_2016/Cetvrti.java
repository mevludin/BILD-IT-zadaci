package zadaci_19_02_2016;

public class Cetvrti {
	public static double ukupnaPovrsina(Pravougaonik[] prav){
		double sum = 0; 
		for (Pravougaonik p : prav) {
			sum += p.getArea();
		}
		return sum;
	}
	
	static class Pravougaonik {
		double strA;
		double strB;

		public Pravougaonik(double stranicaA, double stranicaB) {
			this.strA = stranicaA;
			this.strB = stranicaB;
		}

		public double getArea() {
			return strA * strB;
		}

		@Override
		public String toString() {
			return "Površina pravougaonika stranica A = " + strA + ", stranica B = " + strB+" je: "
					+ getArea();
		}

	}
	public static void main(String[] args) {

		Pravougaonik pv[] = new Pravougaonik[5];
		
		//napravi neke pravougaonike
		for (int i = 0; i < pv.length; i++) {
			pv[i] = new Pravougaonik(new java.util.Random().nextInt(25), new java.util.Random().nextInt(25));
		}
		//ispisi sumu
		System.out.println("Suma svih povrsina je : "+ukupnaPovrsina(pv));
		
	

	}

}
