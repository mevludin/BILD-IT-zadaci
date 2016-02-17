package zadaci_16_02_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class Peti {

	public static void main(String[] args) {
		// napravi file
		File file = new File("X.txt");
		if (file.exists()) {
			System.out.println("Veæ postoji!.");
			System.exit(1);
		}
		// random varijabla tipa random
		Random random = new Random();
		String[] ranks = { "assistant", "associate", "full" };
		try (PrintWriter output = new PrintWriter(file)) {
			// 1000 linija
			for (int i = 0; i < 1000; i++) {
				String firstName = "FirstName" + (i + 1);
				String lastName = "LastName" + (i + 1);

				int index = random.nextInt(ranks.length);

				String rank = ranks[index];
				int salary = 0;

				// nasumicna zarada
				int assistantSalary = 50000 + (int) (Math.random() * 30000);
				int associateSalary = 60000 + (int) (Math.random() * 50000);
				int fullSalary = 75000 + (int) (Math.random() * 55000);
				if (rank == "assistant") {
					salary = assistantSalary;
				} else if (rank == "full") {
					salary = associateSalary;
				} else if (rank == "associate") {
					salary = fullSalary;
				}
				String write = firstName + " " + lastName + " " + rank + " "
						+ salary;
				System.out.println(write);
			}
		} catch (Exception e) {
			System.out.println("Greska");
		}
	}

}
