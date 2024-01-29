
public class Exercise13_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of geometric object
		GeometricObject[] shape = {new Square(4), new Square(5), 
				new Square(3), new Square(10), new Square(8)};
		//Display area for object
		for (int i = 0; i < shape.length; i++) {
			System.out.println("Area for square " + (i+1) + ": " + shape[i].getArea());
			System.out.print("How to color square " + (i + 1) + ": "); 
			shape[i].howToColor();
		}
	}

}
