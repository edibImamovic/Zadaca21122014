/**
 * 
 * Author Edib Imamovic
 * 
 */

package train;

public class GeometricShape {

	public double area; // povrsina
	public double perimeter; // obim

	
	public GeometricShape(double area, double perimeter) {

		this.area = area;
		this.perimeter = perimeter;

	}

	/*
	 * Default-na vrijednost;
	 */

	public GeometricShape() {

		this.area = 20.00;
		this.perimeter = 10.00;
	}

	public GeometricShape(GeometricShape other) {

		this.area = other.area;
		this.perimeter = other.perimeter;
	}

	/*
	 * Konstruktor za provjeru jednakosti.
	 */

	public boolean equals(GeometricShape other) {
		if (this.area == other.area || this.perimeter == other.perimeter) {
			return true;
		} else {
			return false;
		}
	}

	public double getArea() { // get-er za povrsinu.
		return area;
	}

	public void setArea(double area) { // set-er za povrsinu.
		if (area <= 0) {
			throw new IllegalArgumentException("Povrsina ne moze biti nula ili manji od nule ");
		} else {
			this.area = area;
		}

	}

	public double getPerimeter() { // get-er za obim.
		return perimeter;
	}

	public void setPerimeter(double scope) { // set-er za povrsinu.
		if (perimeter <= 0) {
			throw new IllegalArgumentException("Obim ne moze biti nula ili manji od nule");
		} else {
			this.perimeter = scope;
		}
	}

	/*
	 * toString metoda za ispis povrsine i obima.
	 */

	public String toString() {
		return "Povrsina je: " + area + "Obim je: " + perimeter;
	}
}