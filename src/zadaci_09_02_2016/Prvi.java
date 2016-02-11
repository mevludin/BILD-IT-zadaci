package zadaci_09_02_2016;

class MyString1 {
	String mojString = "";

	// konstruktor sa arg moj string
	public MyString1(String mojString) {
		this.mojString = mojString;
	}

	// konstruktor sa arg char
	public MyString1(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			this.mojString += chars[i];
		}
	}
//metoda za prikaz karaktera na odreðenom indeksu
	public char charAt(int index) {
		return mojString.charAt(index);
	}
//metoda za odreðivanje dužine stringa
	public int length() {
		return mojString.length();
	}
//substring
	public MyString1 substring(int begin, int end) {

		int c = (end - begin);//dužina substringa
		char[] ch = new char[c];//broj elemenata u nizu
		for (int i = 0; i < c; i++) {
			ch[i] = charAt(begin);//popunjavanje niza
			begin++;
		}
		return new MyString1(ch);

	}
//pretvara slova u stringu u mala slova
	public MyString1 toLowerCase() {

		String malaSlova = mojString.toLowerCase();
		return new MyString1(malaSlova.toCharArray());
	}
//poredi mojString sa stringom s i traæa true ili false
	public boolean equals(MyString1 s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == mojString.charAt(i))
				return true;

		}
		return false;

	}
//vraæa int vrijednost kao niz karaktera
	public static MyString1 valueOf(int i) {
		
		String novi = i + "";
		return new MyString1(novi.toCharArray());
	}

}

public class Prvi {

	public static void main(String[] args) {

		//test 
		MyString1 proba = new MyString1("MojKurs");
		System.out.println("Slovo na poziciji 1 je: " + proba.charAt(0));
		System.out.println("Dužina stringa je: " + proba.length());
		System.out.println("Substring: " + proba.substring(0, 6));
		System.out.println("Mala slova: " + proba.toLowerCase());
		System.out.println("Usporedba: " + proba.equals("nesto"));
		System.out.println("Vrijednost od: " + proba.valueOf(125));

	}
}
