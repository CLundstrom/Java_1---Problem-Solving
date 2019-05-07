package cl222ae_lab3;

public class RandomWalk {
	
	private static int x = 0;
	private static int y = 1;
	private static int[] playerPos = { 0, 0 }; // x y
	private static int[] xBounds = { 0, 0 }; // -x, x
	private static int[] yBounds = { 0, 0 }; // -y, y
	private static int maxSteps;
	private static int planeSize;
	private static int stepsTaken;

	/**
	 * @param max  Max amount of steps.
	 * @param edge Setting the boundaries of the plane.
	 */
	public RandomWalk(int max, int edge) {
		// Value check
		if (edge < 1 || max < 1) {
			throw new IndexOutOfBoundsException("A plane can not be zero or negative.");
		}

		// Setting defaults
		maxSteps = max;
		planeSize = edge;
		playerPos[x] = 0;
		playerPos[y] = 0;
		setPlaneSize();
	}

	void walk() {

		for(int i = 0; i < maxSteps; i++) {
			
			takeStep();
		}
	}

	private void setPlaneSize() {
		xBounds[0] = 0 - planeSize; //Negative x-boundary
		xBounds[1] = planeSize;		//Positive x-boundary
		yBounds[0] = 0 - planeSize; //Neg y-boundary
		yBounds[1] = planeSize;		//Pos y-boundary
	}

	public boolean inBounds() {
		//Comparing playerpos to boundaries.
		if (playerPos[x] <= xBounds[1] && 
			playerPos[x] >= xBounds[0] && 
			playerPos[y] <= yBounds[1] && 
			playerPos[y] >= yBounds[0]) {
			return true;
		}

		else {
			return false;
		}
	}

	public boolean moreSteps() {

		return stepsTaken < maxSteps;
	}

	public void takeStep() {

		int step = (int) (Math.random() * 100) + 1;
		if (step <= 25) {

			playerPos[y] += 1; // North.
		}

		else if (step > 25 && step <= 50) {
			playerPos[y] -= 1; // South.
		}

		else if (step > 50 && step <= 75) {

			playerPos[x] -= 1; // West.
		}

		else {

			playerPos[x] += 1; // East.
		}

		stepsTaken += 1;
	}

	public String toString() {

		return String.format("Pos(%d,%d) Steps: %d", playerPos[x], playerPos[y], stepsTaken);
	}

}
