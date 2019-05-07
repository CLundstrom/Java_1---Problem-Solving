package cl222ae_lab3;

public class Fraction {

	private int t;
	private int n;

	public Fraction(int t, int n) {
		if (isValidFraction(n)) {
			this.t = t;
			this.n = n;
		}
	}

	/** @param Divide by t/n */
	public Fraction divide(Fraction f) {

		int x = this.t * f.n;
		int y = this.n * f.t;

		if (x < 0 && y < 0) {
			return new Fraction(Math.abs(x), Math.abs(y));
		}

		else {
			return new Fraction(x, y);
		}
	}

	/** @param Multiply by t/n */
	public Fraction multiply(Fraction f) {

		int x = this.t * f.t;
		int y = this.n * f.n;

		if (x < 0 && y < 0) {
			return new Fraction(Math.abs(x), Math.abs(y));
		}

		else {
			return new Fraction(x, y);
		}
	}

	/** @param Subtract t/n */
	public Fraction subtract(Fraction f) {

		int x = this.t * f.n - this.n * f.t;
		int y = this.n * f.n;

		if (x < 0 && y < 0) {
			return new Fraction(Math.abs(x), Math.abs(y));
		}

		else {
			return new Fraction(x, y);
		}
	}

	/** @param Add by t/n. */
	public Fraction add(Fraction f) {

		int x = this.t * f.n + this.n * f.t;
		int y = this.n * f.n;

		if (x < 0 && y < 0) {
			return new Fraction(Math.abs(x), Math.abs(y));
		}

		else {
			return new Fraction(x, y);
		}
	}

	public String toString() {

		return String.format("%d/%d", this.t, this.n);
	}

	/** @param fraction Comparing VALUE equality. */
	public boolean isEqualTo(Fraction fraction) {

		return this.t == fraction.t && this.n == fraction.n ? true : false;
	}

	public boolean isNegative() {

		return this.t < 0 && this.n > 0 || this.t > 0 && this.n < 0 ? true : false;
	}

	/**
	 * Returns the numerator of Fraction.
	 */
	public int getNumerator() {

		return this.t;
	}

	/**
	 * Returns the denominator of Fraction.
	 */
	public int getDenominator() {

		return this.n;
	}

	private boolean isValidFraction(int n) {
		if (n == 0) {
			System.err.println("Cannot divide by Zero.");
			throw new IllegalArgumentException("Denominator is 0");
		} else {
			return true;
		}
	}
}
