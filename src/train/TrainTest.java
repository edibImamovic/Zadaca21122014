package train;

public class TrainTest  {

	public static void main(String[] args) {
		//Vagon
		ComplexBody wagon = new ComplexBody();
		wagon.addBody(new Circle(10));
		wagon.addBody(new Circle(10));
		wagon.addBody(new Rectangle(100, 60));
		System.out.println("Vagon: \n" + wagon.toString());
		//Putnièki vagon
		
		ComplexBody passenger = new ComplexBody();
		passenger.addBody(new Circle(10));
		passenger.addBody(new Circle(10));
		passenger.addBody(new Rectangle(100, 60));
		passenger.addBody(new Square(15));
		passenger.setArea(passenger.getArea() - 15*15);
		passenger.addBody(new Square(15));
		passenger.setArea(passenger.getArea() - 15*15);
		System.out.println("Putnièki vagon: \n" + passenger.toString());
	
		//Lokomotiva
		
		ComplexBody locomotive = new ComplexBody();
		locomotive.addBody(new Rectangle(50, 50));
		locomotive.addBody(new Square(15));
		locomotive.addBody(new Rectangle(120, 40));
		locomotive.addBody(new Circle(10));
		locomotive.addBody(new Circle(10));
		System.out.println("Lokomotiva: \n" + locomotive.toString());
		//Voz
		ComplexBody train = new ComplexBody();
		train.addBody(locomotive);
		train.addBody(passenger);
		train.addBody(wagon);

		System.out.println(train.toString());

	}

}
