/**
 * @author Edib Imamovic
 */

package ba.bitalliance.shapes;

public class Circle extends GeometricShape {

	private double diameter;

	/**
	 * Getter for diameter
	 * 
	 * @return diameter
	 */

	public double getDiameter() {
		return diameter;
	}

	/**
	 * 
	 * @param diameter
	 *            parameter for setter for perimeter value.
	 * @throws new
	 *             illegal exception if value is 0 or less.
	 */
	public void setDiameter(double diameter) {
		if (diameter <= 0) {
			throw new IllegalArgumentException(
					"Perimeter can't have value of 0 or less");
		} else {
			this.diameter = diameter;
		}

	}

	/**
	 * 
	 * @param diameter
	 *            with super constructor.
	 * @throws new
	 *             illegal exception if value is 0 or less.
	 */
	public Circle(double diameter) {
		super(Math.PI * Math.pow(diameter, 2), 2 * diameter * Math.PI);
		if (diameter <= 0) {
			throw new IllegalArgumentException(
					"Perimeter can't have value of 0 or less");
		} else {
			this.diameter = diameter;
		}
	}

	/**
	 * @return toString method.
	 */
	@Override
	public String toString() {
		return "Circle area: " + area + ", perimeter=" + perimeter;
	}

}
