
public class TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 3, 6, 7, 9 };
		
		// isEven(), isOdd(), isPrime()
		System.out.println("Are values even? ");
		for (int i = 0; i < numbers.length; i++) {
			MyInteger value = new MyInteger(numbers[i]);
			System.out.println(value.getInteger() + " " + value.isEven());
			
		}
		
		System.out.println("Are values odd? ");
		for (int i = 0; i < numbers.length; i++ ) {
			MyInteger value = new MyInteger(numbers[i]);
			System.out.println(value.getInteger() + " " + value.isOdd());
		}
		
		System.out.println("Are values prime? ");
		for (int i = 0; i < numbers.length; i++){
			MyInteger value = new MyInteger(numbers[i]);
			System.out.println(value.getInteger() + " " + value.isPrime());
		}
		
		// isEven(int), isOdd(int), isPrime(int)
		System.out.println("Are values even? ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " " +  MyInteger.isEven(numbers[i]));

		}
		
		System.out.println("Are values odd? ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " " + MyInteger.isOdd(numbers[i]));
		}
		
		System.out.println("Are values prime? ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " " + MyInteger.isPrime(numbers[i]));
			
		}
		
		// isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
		
		System.out.println("Are values even? ");
		for (int i = 0; i < numbers.length; i++) {
			MyInteger object = new MyInteger(numbers[i]);
			System.out.println(object.getInteger() + " " + MyInteger.isEven(object));
		}
		
		System.out.println("Are values odd? ");
		for (int i = 0; i < numbers.length; i++) {
			MyInteger object = new MyInteger(numbers[i]);
			System.out.println(object.getInteger() + " " + MyInteger.isOdd(object));
			
		}
		
		System.out.println("Are values prime? ");
		for (int i = 0; i < numbers.length; i++) {
			MyInteger object = new MyInteger(numbers[i]);
			System.out.println(object.getInteger() + " " + MyInteger.isPrime(object));
		}
		
		// equals(int) 
		
		MyInteger value = new MyInteger(3);
		System.out.println("Are values equal to " + value.getInteger() + "?");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " " + value.equals(numbers[i]));
		}
		
		//equals(MyInteger)
		
		System.out.println("Are values equal to " + value.getInteger() + "?");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(value.getInteger() + " " + value.equals(value));
			MyInteger value2 = new MyInteger(numbers[i]);
			System.out.println(numbers[i] + " " + value.equals(value2));
		}
		
		//parseInt(char[])
		
		System.out.println("Converts list into 1 integer value: ");
		char[] list = new char [3];
		list[0] = '4';
		list[1] = '5';
		list[2] = '8';
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println(MyInteger.parseInt(list));
		
		//parseInt(String)
		System.out.println("Converts string into integer value: ");
		String string = "1234h5";
		System.out.println("String " + string + " is " + MyInteger.parseInt(string));
	}

}
