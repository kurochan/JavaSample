package equals;

public class GeneralObjectSample {
	public static void main(String[] args) {
		CarA a1 = new CarA(123, 100);
		CarA a2 = a1;
		CarA a3 = new CarA(123, 100);
		CarA a4 = new CarA(123, 50);
		System.out.println("a1 == a2: " + (a1 == a2));
		System.out.println("a1.equals(a2): " + (a1.equals(a2)));
		System.out.println("a1 == a3: " + (a1 == a3));
		System.out.println("a1.equals(a3): " + (a1.equals(a3)));
		System.out.println("a1 == a4: " + (a1 == a4));
		System.out.println("a1.equals(a4): " + (a1.equals(a4)));

		System.out.println("\n----------\n");

		CarB b1 = new CarB(567, 100);
		CarB b2 = b1;
		CarB b3 = new CarB(123, 100);
		CarB b4 = new CarB(567, 50);
		System.out.println("b1 == b2: " + (b1 == b2));
		System.out.println("b1.equals(b2): " + (b1.equals(b2)));
		System.out.println("b1 == b3: " + (b1 == b3));
		System.out.println("b1.equals(b3): " + (b1.equals(b3)));
		System.out.println("b1 == b4: " + (b1 == b4));
		System.out.println("b1.equals(b4): " + (b1.equals(b4)));
	}
}

class CarA {
	public int number;
	public int fuel;

	CarA(int number, int fuel) {
		this.number = number;
		this.fuel = fuel;
	}
}

class CarB {
	public int number;
	public int fuel;

	CarB(int number, int fuel) {
		this.number = number;
		this.fuel = fuel;
	}

	public boolean equals(CarB car) {
		return (number == car.number);
	}
}