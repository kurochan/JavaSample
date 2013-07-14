package equals;

public class StringSample {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hello, World!".split(",")[0];
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println("\n----------\n");
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + (str1.equals(str2)));
		System.out.println("str1 == str3: " + (str1 == str3));
		System.out.println("str1.equals(str3): " + (str1.equals(str3)));
	}
}