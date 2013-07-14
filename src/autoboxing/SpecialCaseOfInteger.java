package autoboxing;

public class SpecialCaseOfInteger {
	public static void main(String[] args) {
		Integer n1 = 10;
		Integer n2 = 10;
		System.out.println("n1 == n2: " + (n1 == n2));
		Integer n3 = 200;
		Integer n4 = 200;
		System.out.println("n3 == n4: " + (n3 == n4));

		System.out.println("\n----------\n");

		for (int i = -200; i <= 200; i++) {
			Integer n5 = i;
			Integer n6 = i;
			System.out.println(n5 + " == " + n6 + ": " + (n5 == n6));
		}
	}
}
