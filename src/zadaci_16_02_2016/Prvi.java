package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		// fajl sa textom
		File file = new File("src/zadaci_16_02_2016/test");
		if (!file.exists()) {
			System.out.println(file + " ne postoji");
			System.exit(1);
		}
		// ArrayList<String>lista=new ArrayList<>();
		// string builder
		StringBuilder str = new StringBuilder();
		// reading from file and changing bracket style
		try {
			Scanner citac = new Scanner(file);
			while (citac.hasNext()) {
				String s = citac.nextLine();

				if (s.contains("{")) {
					str.append(s);
				} else {
					str.append("\n" + s);
				}
			}
			citac.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// upisuje novi izgled filea
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.write(str.toString());
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// ispis
		System.out.println(str);

	}

}
