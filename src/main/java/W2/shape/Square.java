package W2.shape;

public class Square extends Shape {
  private double side;
  private static int a = 10;

  //constructor
  public Square(double squareSide,String squareName){
	  super(squareName);
	  side=squareSide;
  }
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

}
