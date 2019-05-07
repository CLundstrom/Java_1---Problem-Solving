package cl222ae_lab3;

public class Point {

	private int x;
	private int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {

		return String.format("(%s,%s)", x, y);
	}

	public boolean isEqualTo(Point point) {

		return this.x == point.x && this.y == point.y ? true: false;
	}

	public double distanceTo(Point point) {
		//Absolute value when dealing with distances.
		double x = Math.abs(this.x - point.x);
		double y = Math.abs(this.y - point.y);
		x = Math.pow(x, 2);
		y = Math.pow(y, 2);

		return Math.sqrt(x + y);
	}

	public void move(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public void moveToXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
