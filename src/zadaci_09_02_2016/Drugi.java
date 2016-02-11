package zadaci_09_02_2016;

class MyString2 {
	String mojString = "";

	// no arg konstrktor
	public MyString2() {
	}

	// konstruktor sa arg string s
	public MyString2(String s) {
		this.mojString = s;
	}

	// metoda poredi dva stringa
	public int compare(String s) {
		return mojString.compareTo(s);
	}

	// metoda vraca substring od karaktera na odreðenom indeksu do kraja stringa
	public MyString2 substring(int begin) {
		char[] ch = mojString.toCharArray();
		String result = "";
		for (int i = begin; i < ch.length; i++) {
			result += ch[i];
		}
		return new MyString2(result);
	}

	// metoda pretvara string u niz karaktera
	public char[] toChars() {
		char[] ch = mojString.toCharArray();
		return ch;
	}

	// pretvara slova u stringu u velika slova
	public MyString2 toUpperCase() {
		String velikaSlova = mojString.toUpperCase();
		return new MyString2(velikaSlova);
	}

	// ako je string vraca true, ako ne false
	public static MyString2 valueOf(boolean b) {
		String result = "";
		if (b) {
			result = "true";
		} else {
			result = "false";
		}
		return new MyString2(result);
	}

}

public class Drugi {

	public static void main(String[] args) {
		//test
		MyString2 proba = new MyString2("MojKurs");
		System.out.println("Test usporedbe: " + proba.compare("Java"));
		System.out.println("Test substring, 1" + proba.substring(1));

		System.out.println("Test to uppeCase" + proba.toUpperCase());
		System.out.println("Test value of false"
				+ proba.valueOf(false).toUpperCase());

	}

}
