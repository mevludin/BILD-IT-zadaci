package zadaci_29_01_2016;

public class Prvi {

	public static void main(String[] args) {
		for (int i=1;i<=12;i++){
			//mjeseci smjesteni u niz stringova
		String []mjeseci={"","Januar","Februar","Mart","April","Maj","Juni","Juli",
				"Avgust","Septembar","Oktobar","Novembar","Decembar"};
		int brMj=(int)((Math.random()*12)+1);//nasumican br
		//poziv mjeseca iz niza
System.out.println("Mjesec "+mjeseci[brMj]+" je "+brMj+". mjesec u godini!");
		}
	}

}
