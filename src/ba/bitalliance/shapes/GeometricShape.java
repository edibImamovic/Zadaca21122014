/**
 * 
 * @author Edib Imamovic
 * 
 */

package ba.bitalliance.shapes;

public class GeometricShape {

	protected double area;
	protected double perimeter;

	/**
	 * Constructor with parameters.
	 * 
	 * @param area
	 *            is parameter for area.
	 * @param perimeter
	 *            is parameter for perimeter.
	 * @throws new
	 *             illegal exception if value is 0 or less.
	 */

	public GeometricShape(double area, double perimeter) {

		if (area <= 0) {
			throw new IllegalArgumentException(
					"area can't have value of 0 or less");
		} else {
			this.area = area;
		}
		if (perimeter <= 0) {
			throw new IllegalArgumentException(
					"perimeter can't have value of 0 or less");
		} else {
			this.perimeter = perimeter;
		}

	}

	/**
	 * Constructor with default values.
	 * 
	 * @param area
	 *            parameter for default values of area.
	 * @param perimeter
	 *            parameter for default values of perimeter.
	 * 
	 */
	public GeometricShape() {

		this.area = 20.00;
		this.perimeter = 10.00;
	}

	/**
	 * @param other
	 *            parameter of input value of class GeometricShape.
	 * @throws new
	 *             illegal exception if value is 0 or less.
	 * 
	 */
	public GeometricShape(GeometricShape other) {

		if (area <= 0) {
			throw new IllegalArgumentException(
					"area can't have value of 0 or less");
		} else {
			this.area = other.area;

			if (perimeter <= 0) {
				throw new IllegalArgumentException(
						"perimeter can't have value of 0 or less");
			} else {
				this.perimeter = other.perimeter;
			}
		}
	}

	/**
	 * 
	 * @param other
	 *            parameter of input value of class GeometricShape.
	 * @return of boolean value if other is equal to area.
	 * 
	 */
	public boolean equals(GeometricShape other) {
		if (this.area == other.area) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Getter for area.
	 * 
	 * @return area.
	 */
	public double getArea() {
		return area;
	}

	/**
	 * 
	 * @param area
	 *            parameter for setter for area value.
	 * @throws new
	 *             illegal exception if value is 0 or less.
	 */
	public void setArea(double area) {
		if (area <= 0) {
			throw new IllegalArgumentException(
					"Area can't have value of 0 or less");
		} else {
			this.area = area;
		}

	}

	/**
	 * Getter for perimeter.
	 * 
	 * @return perimeter.
	 */
	public double getPerimeter() {
		return perimeter;
	}

	/**
	 * Setter for perimeter
	 * 
	 * @param perimeter
	 *            parameter for setter for perimeter value.
	 * @throws new
	 *             illegal exception if value is 0 or less.
	 */
	public void setPerimeter(double perimeter) {
		if (perimeter <= 0) {
			throw new IllegalArgumentException(
					"Perimeter can't have value of 0 or less");
		} else {
			this.perimeter = perimeter;
		}
	}

	/**
	 * @return toString method.
	 */
	public String toString() {
		return "Value of area is: " + area + "\nValue of perimeter is: "
				+ perimeter;
	}
}