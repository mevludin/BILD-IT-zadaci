package grupni_projekat_sql;

import java.sql.*;
import java.util.InputMismatchException;

public class Uvod {
	//metoda za unos 
	public static String line() {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		String naziv = unos.nextLine().toUpperCase();
		unos.close();
		return naziv;

	}

	public static void main(String[] args) throws SQLException {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		try {
			// konekcija sa bazom podataka
			Connection konekcija = DriverManager.getConnection(
					"jdbc:mysql://localhost/world", "root", "mojasifra");
			// objekt koji implementira  SQL izjave
			Statement statement = konekcija.createStatement();
			String query = "";
			// opcije

			System.out.println("1 - Lista svih država;");
			System.out.println("2 - Lista svih gradova;");
			System.out.println("3 - Lista jezika;");
			System.out.println("4 - Odabir države;");
			System.out.println("5 - informacije za odabrani grad;");
			
			int choise = unos.nextInt();
			while (choise < 0 || choise > 5) {
				System.out.println("Pogresno unesi ponovo:");
				choise = unos.nextInt();
			}

			switch (choise) {
			case 1: {
				// query za bazu podataka
				query = "SELECT * from country;";
				// rezultat
				ResultSet resultat = statement.executeQuery(query);
				// ispis
				while (resultat.next()) {
					System.out.println(resultat.getString("Name"));
				}
				break;
			}
			case 2: {
				// query za bazu podatak
				query = "SELECT * from city;";
				// rezultat
				ResultSet resultat = statement.executeQuery(query);
				// ispis
				while (resultat.next()) {
					System.out.println(resultat.getString("Name"));
				}
				break;
			}
			case 3: {
				query = "SELECT * from countrylanguage;";
				ResultSet resultat = statement.executeQuery(query);
				// ispis
				while (resultat.next()) {
					System.out.println(resultat.getString("Language"));
				}
				break;
			}

			case 4: {
				System.out.println("Enter a country name:");
				String country = line();
				// query koji korisnik unosi
				query = "SELECT * from country where name = '" + country + "';";
				ResultSet resultat = statement.executeQuery(query);
				//ispis rezulatata
				while (resultat.next()) {
					System.out
							.println("Name, Continent, Region, Population, Surface Area: ");
					System.out.println(resultat.getString("Name") + ", "
							+ resultat.getString("Continent") + ", "
							+ resultat.getString("Region") + ", "
							+ resultat.getString("Population") + ", "
							+ resultat.getString("SurfaceArea"));
				}
				break;
			}
			case 5: {
				System.out.println("Enter a city name:");
				String city = line();
				// query od korisnika
				query = "SELECT * from city where name = '" + city + "';";
				ResultSet resultat = statement.executeQuery(query);
				// ispis
				while (resultat.next()) {
					System.out
							.println("Name, Country Code, District, Population: ");
					System.out.println(resultat.getString("Name") + ", "
							+ resultat.getString("CountryCode") + ", "
							+ resultat.getString("District") + ", "
							+ resultat.getString("Population"));
				}
				break;
			}
			}
			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Pogrešan unos!");
			main(args);
		} catch (SQLException ey) {
			System.out.println("Greska:");
			main(args);
		}

	}
}

