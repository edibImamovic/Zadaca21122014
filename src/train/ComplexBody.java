package train;

public class ComplexBody extends GeometricShape{

	private GeometricShape[] array;
	private int counter;
	

	
	//konstruktor bez parametara
	public ComplexBody(){
		
		this.array = new GeometricShape[1];
		
	}
	//dodavanje dijelova vozica u vidu geometriskih tijela
	
	public void addBody (GeometricShape body) {
		
		array[counter]=body;
		counter++;
		if (counter==array.length){
			array = grow(array); 
		}
		
		
		
	}
	
	/**
	 * Funkcija za sirenje niza (niz se povecava 2 puta)
	 * @param source
	 * @return
	 */
	
	public  GeometricShape[] grow(GeometricShape[] source) {
		GeometricShape[] result = new GeometricShape[source.length * 2];
        
        for (int i = 0; i < source.length; i+=1) {
            result[i] = source[i];
        }
        
        return result;
    }

	/*
	 * Metoda koja racuna ukupnu povrsinu kompleksnog geometrijskog tijela
	 */
	public double getArea(){
		double area = 0;
		for (int i = 0; i < counter; i++){
			area += array[i].getArea();
		}
		return area;
	}
	
	/*
	 * Metoda koja racuna ukupni obim kompleksnog geometrijskog tijela
	 */
	public double getPerimeter(){
		double perimeter = 0;
		for (int i = 0; i < counter; i++){
			perimeter += array[i].getPerimeter();
		}
		return perimeter;
	}




	
}