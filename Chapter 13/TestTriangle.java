import java.util.Scanner;

public class TestTriangle {

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
	}

}
