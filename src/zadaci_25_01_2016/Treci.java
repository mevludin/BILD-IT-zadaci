package zadaci_25_01_2016;

import java.util.Date;



public class Treci {
	
	public static void main(String[] args) {
		
		// java util date
				Date datum = new Date(System.currentTimeMillis());
				//ispis poruke
				System.out.print("Trenutni datum i vrijeme : ");
				//imena mjeseci
				String mjeseci[] = {"januar","februar","mart","april","maj","juni","juli",
						"august","septembar","oktobar","novembar","decembar"};
				//ispis trazenog formata
				System.out.printf("%d. %s, %d ",datum.getDate(),mjeseci[datum.getMonth()],datum.getYear()+1900);
				System.out.printf(" -  %d : %d :%d ",datum.getHours(),datum.getMinutes(),datum.getSeconds());
			}

}
