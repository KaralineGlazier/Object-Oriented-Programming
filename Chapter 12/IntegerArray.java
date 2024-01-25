
import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates Array with 100 randomly chosen integers
		int[] randomNum = new int[100];
		for (int i = 0; i < 100; i++) {
			randomNum[i] = (int)(Math.random() * 100);
		}
		//Prompts the user to enter the index of the array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the index of the array");
		// Make chosen index of array a variable
		int indexNum = input.nextInt();
		
		try {
			System.out.println(randomNum[indexNum]);
		}
		
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
		
		
			
	}
	
}