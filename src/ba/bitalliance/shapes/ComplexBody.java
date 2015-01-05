package ba.bitalliance.shapes;

import java.util.Arrays;

/**
 * 
 * @author Edib Imamovic
 *
 */
public class ComplexBody extends GeometricShape {

	private GeometricShape[] array; // array of geometric shapes
	private int counter; // Variable int counter for adding body

	/**
	 * @param constructor
	 *            for array
	 */
	public ComplexBody() {

		this.array = new GeometricShape[1];

	}

	/**
	 * 
	 * @param body
	 *            of GeometricShape in addBody function for adding geometric
	 *            bodies in array, with option to grow array.
	 * 
	 */
	public void addBody(GeometricShape body) {

		array[counter] = body;
		counter++;
		if (counter == array.length) {
			array = grow(array);
		}

	}

	/**
	 * 
	 * @param source
	 *            of array which will be increased to his length.
	 * @return new grow array.
	 */

	public GeometricShape[] grow(GeometricShape[] source) {
		GeometricShape[] result = new GeometricShape[source.length * 2];

		for (int i = 0; i < source.length; i += 1) {
			result[i] = source[i];
		}

		return result;
	}

	/**
	 * Getter for Area
	 * 
	 * @return area.
	 */
	public double getArea() {
		double area = 0;
		for (int i = 0; i < counter; i++) {
			area += array[i].getArea();
		}
		return area;
	}

	/**
	 * Getter for perimeter
	 * 
	 * @return perimeter.
	 */
	public double getPerimeter() {
		double perimeter = 0;
		for (int i = 0; i < counter; i++) {
			perimeter += array[i].getPerimeter();
		}
		return perimeter;
	}

	/**
	 * @Override of toString method.
	 */

	public String toString() {
		return "ComplexBody array: " + Arrays.toString(array);
	}

}