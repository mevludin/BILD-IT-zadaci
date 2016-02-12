package zadaca_10_02_2016;

public class Test2 {

	public static void main(String[] args) {
		//kreiramo objekte, testiramo funkcije
		Person osoba = new Person("Neko");
		Student student = new Student("Student");
		Employee zaposlenik = new Employee("Zaposlen");
		Faculty profesor = new Faculty("Profesor");
		Staff staff = new Staff("staff");
		//to string
		System.out.println(osoba.toString());
		System.out.println(student.toString());
		System.out.println(zaposlenik.toString());
		System.out.println(profesor.toString());
		System.out.println(staff.toString());

	}

}
