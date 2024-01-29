
public class TestOctagon {

	public static void main(String[] args) {
		// Display Octagon's area and Perimeter
		Octagon octagon1 = new Octagon(5);
		System.out.println(octagon1.getArea());
		System.out.println(octagon1.getPerimeter());
		
		//Clone Octagon into another Octagon
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		//Use compareTo() to compare the two objects
		int octagons = octagon1.compareTo(octagon2);
		
		if (octagons == 1) {
			System.out.println("Octagon is less than other octagon");
		}
		else if (octagons == -1) {
			System.out.println("Octagon is greater than other octagon");
		}
		else {
			System.out.println("Octagons are equal");
		}
	}

}
