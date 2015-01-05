package ba.bitalliance.shapes;

/**
 * 
 * @author Edib Imamovic
 * 
 */
public class Square extends Rectangle {

	/**
	 * 
	 * @param sideA
	 *            parameter for square, since square sides are equal , we need
	 *            only one side value.
	 * 
	 */

	public Square(double sideA) {
		super(Math.pow(sideA, 2), 4 * sideA); // formula for calculation of
												// Square area and diameter.

	}

	/**
	 * @Override method of toString method.
	 */
	public String toString() {

		return "Square area is: " + area + "Value of perimeter is:" + perimeter;
	}

}
