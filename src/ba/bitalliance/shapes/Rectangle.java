/**
 * 
 * @author Edib Imamovic
 */

package ba.bitalliance.shapes;

public class Rectangle extends GeometricShape {

	private double sideA;
	private double sideB;

	/**
	 * 
	 * @param sideA
	 *            parameter for first side of rectangle.
	 * @param sideB
	 *            parameter for second side of rectangle.
	 * @throws throws new illegal exception if value is 0 or less.
	 * 
	 */
	public Rectangle(double sideA, double sideB) {
		super(sideA * sideB, Math.pow(sideA, 2) + Math.pow(sideB, 2)); // formula
																		// for
																		// calculation
																		// of
																		// Rectangle
																		// area
																		// and
																		// diameter.

		if (sideA <= 0) {
			throw new IllegalArgumentException(
					"Side can't have value of 0 or less");
		} else {
			this.sideA = sideA;
		}
		if (sideB <= 0) {
			throw new IllegalArgumentException(
					"Side can't have value of 0 or less");
		} else {
			this.sideB = sideB;
		}
	}

	/**
	 * Getter for sideA
	 * 
	 * @return sideA
	 */
	public double getSideA() {
		return sideA;
	}

	/**
	 * Setter for sideA
	 * 
	 * @param sideA
	 *            side of rectangle
	 * @throws throws new illegal exception if value is 0 or less.
	 * 
	 */
	public void setSideA(double sideA) {
		if (sideA <= 0) {
			throw new IllegalArgumentException(
					"Side can't have value of 0 or less");
		} else {
			this.sideA = sideA;
		}

	}

	/**
	 * Getter for sideB
	 * 
	 * @return sideB side of rectangle.
	 */
	public double getSideB() {
		return sideB;
	}

	/**
	 * Setter for sideB
	 * 
	 * @param sideB
	 * @throws throws new illegal exception if value is 0 or less.
	 */
	public void setSideB(double sideB) {
		if (sideB <= 0) {
			throw new IllegalArgumentException(
					"Side can't have value of 0 or less");
		}
		this.sideB = sideB;
	}

}
