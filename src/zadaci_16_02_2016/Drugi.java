package zadaci_16_02_2016;

import java.io.File;
import java.io.PrintWriter;

public class Drugi {

	public static void main(String[] args) {
		// file
		File file = new File("src/zadaci_16_02_2016/test");
		// ako nije dir ispisi poruku
		if (!file.isDirectory()) {
			System.out.println("File direktorij ne postoji.");
		}
		File[] chapters = new File[34];// niz ch
		File[] directorij = new File[34];// niz dir
		for (int i = 0; i < 34; i++) {
			directorij[i] = new File("file " + (i + 1));
			directorij[i].mkdir();
			chapters[i] = new File("file" + (i + 1) + "chapter" + (i + 1));
			try (PrintWriter output = new PrintWriter(chapters[i])) {
				output.println("Chapter" + i);
			} catch (Exception e) {
				System.out.println("Greskica!");
			}
		}

	}

}
