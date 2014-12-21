package train;

public class Square extends Rectangle {

	public Square(double sideA) {
		super( Math.pow(sideA, 2),4*sideA ); // Racunanje povrsine i obima kvadrata
		
	}

	@Override
	public String toString() {
		return "Square [area=" + area + ", perimeter=" + perimeter + "]";
	}

}
