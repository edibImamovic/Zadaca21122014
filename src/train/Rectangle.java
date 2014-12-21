package train;

public class Rectangle extends GeometricShape {
	
	private double sideA;
	private double sideB;
	
	
	public Rectangle (double sideA, double sideB){
		super (sideA * sideB, Math.pow(sideA, 2)+Math.pow(sideB, 2));  //formule za racunaje povrsine i obima 
		
		this.sideA=sideA;
		this.sideB=sideB;
	}


	public double getsideA() {
		return sideA;
	}
	/**
	 * setter za prvu stranicu pravougaonika
	 * @param sideA
	 */
	public void setsideA(double sideA) {
		if (sideA<=0){
			throw new IllegalArgumentException("Vrijednost unijete stranice ne moze biti nula ili manje od nule");
		} else {
			this.sideA = sideA;
		}
		
	}
	public double getSecondSide() {
		return sideB;
	}
	/**
	 * setter za drugu stranicu pravougaonika
	 * @param sideB
	 */
	public void setSecondSide(double sideB) {
		if (sideB<=0){
			throw new IllegalArgumentException("Vrijednost unijete stranice ne moze biti nula ili manje od nule");
		}		
		this.sideB = sideB;
	}
}
