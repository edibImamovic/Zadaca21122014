package train;

public class Circle extends GeometricShape {
	
	private double diameter; // poluprecnik 

	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if (diameter<=0){
			throw new IllegalArgumentException("Vrijednost poluprecnika ne moze biti nula ili manje od nule");
		} else {
			this.diameter = diameter;
		}
		
	}

	public Circle (double diameter){
		super(Math.PI * Math.pow(diameter, 2), 2 * diameter * Math.PI); // formula za racunanje povrsine i obima kruga
		this.diameter = diameter;	
	}
		
	
	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", area=" + area
				+ ", perimeter=" + perimeter + "]";
	}
	
	}
		
		

