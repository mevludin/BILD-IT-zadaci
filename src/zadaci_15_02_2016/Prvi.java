package zadaci_15_02_2016;

public class Prvi {
	public static int bin2Dec(String binaryString) {
		if (!binaryString.matches("^([0-1])*$"))
			// ako je upisani br razlièit od nula i jedan izbacuje poruku
			throw new NumberFormatException("Nije binarni zapis.");
		else
			return Integer.parseInt(binaryString, 2);

	}

	public static void main(String[] args) {
		try {
			// ispis binarnog zapisa u decimalnom
			System.out.println(bin2Dec("100010"));
			// ispisuje gresku jer nije binarni zapis
			System.out.println(bin2Dec("55"));

		} catch (NumberFormatException e) {
			System.out.println("Greska!!!");

		}
	}

}
