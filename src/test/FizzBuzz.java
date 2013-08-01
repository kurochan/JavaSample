package test;

public class FizzBuzz {

	public static String eval(int n) {
		if (n % 15 == 0) {
			return "FizzBuzz";
		} else if (n % 3 == 0) {
			return "Fizz";
		} else if (n % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(n);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(eval(i));
		}
	}
}
