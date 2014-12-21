package train;

public class Circle extends GeometricShape {
	
	private double diameter; // poluprecnik 
	
	public Circle (double diameter){
		super(Math.PI * Math.pow(diameter, 2), 2 * diameter * Math.PI); // 
		this.diameter = diameter;	
	}
		
	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", area=" + area
				+ ", perimeter=" + perimeter + "]";
	}
	
	}
		
		

