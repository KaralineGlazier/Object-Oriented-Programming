import java.util.*;
import java.io.*;

public class WriteData {
	public static void main(String[] args) throws Exception {
		// writes to file
		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		// create file
		try (
				PrintWriter output = new PrintWriter(file)
			){
		// write in file
			for (int i = 0; i < 100; i++) {
				output.print((int)(Math.random()* 500));
				output.print(" ");
			}
		}
		// put integers in an array and use the sort method in the ArrayList class
		ArrayList <Integer> listOfIntegers = new ArrayList<>();
		
		try (
				Scanner input = new Scanner(file);
				){
			// read data from file
			while (input.hasNext()) {
				listOfIntegers.add(input.nextInt());
			}
		}
		//put integers into increasing order and print to console
		Collections.sort(listOfIntegers);
		System.out.print(listOfIntegers.toString());
		System.out.println();
	}
	
}
