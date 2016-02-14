package zadaci_12_02_2016;

import java.util.Scanner;

public class Peti {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Peti() {
		this(2.5, 1, 1000);
	}

	// number of years, and loan amount
	// */
	public Peti(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		try {
			double annualInterestRate = input.nextDouble();

			// Enter number of years
			System.out.print("Enter number of years as an integer: ");
			int numberOfYears = input.nextInt();
			// ako je br godina izvan granica izbacuje gresku
			if (numberOfYears > 5 && numberOfYears < 55) {
			} else {
				throw new IllegalArgumentException(" od 5 do 55 ");
			}

			// Enter loan amount
			System.out.print("Enter loan amount, for example, 120000.95: ");
			double loanAmount = input.nextDouble();

			// Create a Loan object
			Peti loan = new Peti(annualInterestRate, numberOfYears, loanAmount);

			// Display loan date, monthly payment, and total payment
			System.out
					.printf("The loan was created on %s\n"
							+ "The monthly payment is %.2f\nThe total payment is %.2f\n",
							loan.getLoanDate().toString(),
							loan.getMonthlyPayment(), loan.getTotalPayment());
			input.close();
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
			main(args);
		}
		input.close();
	}
}
