package zadaci_04_02_2016;

import java.util.Date;

class Account{
	//polje podataka
	private int id = 0;
	private double balance = 0;
	private double anualInterestRate = 0;
	private Date dateCreated;
	 
	Account(){//no arg konatruktor
		
	}
//geteri i seteri
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnualInterestRate() {
		return anualInterestRate;
	}

	public void setAnualInterestRate(double anualInterestRate) {
		this.anualInterestRate = anualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
//konstruktor sa argumentima
	public Account(int id, double balance, double anualInterestRate,
			Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.anualInterestRate = anualInterestRate;
		this.dateCreated = dateCreated;
	}
	//mjeseèna interesna stopa
	public double getMonthlyInterestRate(){
		return anualInterestRate / 12;
	}
	//mjesecna dobit
	public double getMonthlyInterest(){
		return balance*anualInterestRate / 12;
	}
	//povlacenje novca
	public void widthdraw(double kolicina){
		if(kolicina < this.balance){
			this.balance -= kolicina;
		}
	}
	//dodavanje novca
	public void deposit(double kolicina){
		this.balance += kolicina;	
	}
}
public class Cetvrti {
//test
	public static void main(String[] args) {
		Account korisnik = new Account(10, 200, 4.5, new Date());
		korisnik.widthdraw(25500);
		korisnik.deposit(30000);
		//ispisi balance
		System.out.println(korisnik.getBalance()+"  KM");
	}

	

}
