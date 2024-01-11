
public class MyInteger {
private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getInteger() {
		return value;
	}
	
	boolean isEven() {
		return isEven(value);
	}
	
	boolean isOdd() {
		return isOdd(value);
	}
	
	boolean isPrime() {
		return isPrime(value);
	}
	
	static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean isOdd(int number) {
		if (number % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isPrime(int number) {
		boolean isItPrime = true;
		if (number <= 1) {
			isItPrime = false;
			return isItPrime;
		}
		else {
		for (int i = 2; i <= number/2; i++) {
			if((number % i) == 0) {
				isItPrime = false;
				break;
			}
		}
			return isItPrime;
		}
	}
	
	static boolean isEven(MyInteger object) {
		return object.isEven();
	}
	
	static boolean isOdd(MyInteger object) {
		return object.isOdd();
	}
	
	static boolean isPrime(MyInteger object) {
		return object.isPrime();
	}
	
	boolean equals(int number) {
		if (this.value == number) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean equals(MyInteger object) {
		if (object.value == this.value) {
			return true;
		}
		else {
			return false;
		}
	}
	static int parseInt(char[] characters) {
		int j = 0;
		for (int i = 0; i < characters.length; i++) {
			j++;
		}
		return j;
	}
	
	public static int parseInt(String string) {
		int j = 0;
		for (int i = 0; i < string.length(); i++) {
			
		}
		return j;
	}
}