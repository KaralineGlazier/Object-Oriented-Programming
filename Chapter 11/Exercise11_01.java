import java.util.Scanner;

public class Exercise11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter a color");
		String color = input.next();
		
		System.out.println("Is the triangle filled? (enter true for yes or false for no) ");
		Boolean filled = input.nextBoolean();
		
		// create object 
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
		System.out.println("The area of the triangle is " + triangle.getArea());
		System.out.println("The color of the triangle is " + triangle.getColor());
		
		if (triangle.isFilled()) {
			System.out.println("Triangle is filled");
		}
		else {
			System.out.println("Triangle is not filled");
		}
	}

}
	class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	 Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
	} 
	
	 Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
		
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s *(s - side1)*(s - side2) * (s - side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
	}
}
