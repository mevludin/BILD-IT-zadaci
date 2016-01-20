package zadaci_20_01_2016;

public class Drugi {

	public static void main(String[] args) {
		//importivanje i kreiranje scannera
				java.util.Scanner unos = new java.util.Scanner(System.in);
				//poruka za unos poc godine
				System.out.print("Unesi pocetnu godinu: ");
				int pocetna=unos.nextInt();//unos od strane korisnika
				System.out.print("Unesi krajnju godinu: ");
				int krajnja=unos.nextInt();
				unos.close();//zatvaranje scannera
				int brojac=0;
				int b=0;
				//petlaja unutar koje se pronalazi prestupna godina
				for (int i=pocetna;i<=krajnja;i++){
					
					if (i%400==0||i%4==0&&i%100!=0){
						System.out.printf(i+" ");
						brojac++;
						b++;
						if (b==10){//novi red nakon 10 brojeva
							System.out.println();
							b=0;
						}
					}
					
				}
				System.out.println();
				//poruka za broj pr godina u zadanom rasponu
				System.out.println("Broj prestupnih godina: "+brojac);
			}

	}


