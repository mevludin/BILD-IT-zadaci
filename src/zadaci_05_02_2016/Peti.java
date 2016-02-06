package zadaci_05_02_2016;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try {
			// Unos taèaka na kooridnatnom sistemu
			System.out.println("Taèka 1 - linija 1");
			System.out.print("x1 : ");
			int x1 = unos.nextInt();
			System.out.print("y1 : ");
			int y1 = unos.nextInt();

			System.out.println("Taèka 2 - linija 1");
			System.out.print("x2 : ");
			int x2 = unos.nextInt();
			System.out.print("y2 : ");
			int y2 = unos.nextInt();

			System.out.println("Taèka 1 - linija 2");
			System.out.print("x3 : ");
			int x3 = unos.nextInt();
			System.out.print("y3 : ");
			int y3 = unos.nextInt();

			System.out.println("Taèka 2 - linija 2");
			System.out.print("x4 : ");
			int x4 = unos.nextInt();
			System.out.print("y4 : ");
			int y4 = unos.nextInt();

			// provjeri da li su linije paralelne
			int paralelne = ((x1 - x2) * (y3 - y4)) - ((y1 - y2) * (x3 - x4));

			if (paralelne == 0) {
				System.out.println("Linije su paralelne");
				System.exit(0);
			}

			// linearna jednacina
			LinearEquation jednacina = new LinearEquation((y1 - y2),
					(-x1 + x2), (y3 - y4), (-x3 + x4),
					(-y1 * (x1 - x2 + (y1 - y2) * x1)),
					(-y3 * (x3 - x4) + (y3 - y4) * x3));

			// ako se sijeku, sijeku se u taèki sa koordinatama
			System.out.print("Linije se sjeku u taèki: " + jednacina.getX()
					+ "," + jednacina.getY());

		} catch (Exception e) {
			System.out.println("Greska...ponovite unos!");
			main(args);
		}
		unos.close();
	}

}
