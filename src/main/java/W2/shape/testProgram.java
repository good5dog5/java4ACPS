package W2.shape;


public class testProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle1 = new Circle(20.0, "circle");
		Shape circle2 = new Circle(10.0, "circle");
		Shape circle3 = new Circle(10.0, "circle");

		Shape square = new Square(4.0, "square");
//
		System.out.println("area of " + circle1.getName() + "is" + circle1.area());
		System.out.println("area of " + square.getName() + "is" + square.area());
	}

}
