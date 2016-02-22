package zadaca_20_02_2016;

//public class Prvi {
	public class Prvi extends Number implements Comparable<Prvi> {
		 // Data fields for numerator and denominator
		 private long numerator = 0;
		 private long denominator = 1;
		 private long[] r = new long[2];
		
		 /** Construct a rational with default properties */
		 public Prvi() {
		 this(0, 1);
		 }
		
		 /** Construct a rational with specified numerator and denominator */
		 public Prvi(long numerator, long denominator) {
		 long gcd = gcd(numerator, denominator);
		 this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		 this.denominator = Math.abs(denominator) / gcd;
		 }
		 /** setters */
			public void setNumerator(long numerator) {
				this.numerator = numerator;
			}

			public void setDenominator(long denominator) {
				this.denominator = denominator;
			}
		/**getters and setters for array */
			public long[] getR() {
				this.r[0] = this.numerator;
				this.r[1] = this.denominator;
				return r;
			}

			public void setR(long[] r) {
				this.r = r;
			}
		
		 /** Find GCD of two numbers */
		 private static long gcd(long n, long d) {
		 long n1 = Math.abs(n);
		 long n2 = Math.abs(d);
		 int gcd = 1;
		
		 for (int k = 1; k <= n1 && k <= n2; k++) {
		 if (n1 % k == 0 && n2 % k == 0)
		 gcd = k;
		 }
		
		 return gcd;
		 }
		 /** Return numerator */
		 public long getNumerator() {
		 return numerator;
		 }
		
		 /** Return denominator */
		 public long getDenominator() {
		 return denominator;
		 }
		
		 /** Add a rational number to this rational */
		 public Prvi add(Prvi secondRational) {
		 long n = numerator * secondRational.getDenominator() +
		 denominator * secondRational.getNumerator();
		 long d = denominator * secondRational.getDenominator();
		 return new Prvi(n, d);
		 }
		
		 /** Subtract a rational number from this rational */
		 public Prvi subtract(Prvi secondRational) {
		 long n = numerator * secondRational.getDenominator()
		 - denominator * secondRational.getNumerator();
		 long d = denominator * secondRational.getDenominator();
		 return new Prvi(n, d);
		 }
		
		 /** Multiply a rational number by this rational */
		 public Prvi multiply(Prvi secondRational) {
		 long n = numerator * secondRational.getNumerator();
		 long d = denominator * secondRational.getDenominator();
		 return new Prvi(n, d);
		 }
		
		 /** Divide a rational number by this rational */
		 public Prvi divide(Prvi secondRational) {
		 long n = numerator * secondRational.getDenominator();
		 long d = denominator * secondRational.numerator;
		 return new Prvi(n, d);
		 }
		
		 @Override
		 public String toString() {
		 if (denominator == 1)
		 return numerator + "";
		 else
		 return numerator + "/" + denominator;
		 }
		
		 @Override // Override the equals method in the Object class
		 public boolean equals(Object other) {
		 if ((this.subtract((Prvi)(other))).getNumerator() == 0)
		 return true;
		 else
		 return false;
		 }
		
		 @Override // Implement the abstract intValue method in Number
		 public int intValue() {
		return (int)doubleValue();
		 }
		
			 @Override // Implement the abstract floatValue method in Number
			 public float floatValue() {
			 return (float)doubleValue();
			 }
			 @Override // Implement the doubleValue method in Number
			 public double doubleValue() {
			 return numerator * 1.0 / denominator;
			 }
			
			 @Override // Implement the abstract longValue method in Number
			 public long longValue() {
			 return (long)doubleValue();
			 }
			
			 @Override // Implement the compareTo method in Comparable
			 public int compareTo(Prvi o) {
			 if (this.subtract(o).getNumerator() > 0)
			 return 1;
			 else if (this.subtract(o).getNumerator() < 0)
			 return -1;
			 else
			 return 0;
			 }
			 }
		


