package jitcompile;
public class OptimizeTest1 {
	public static void main(String[] argv) {
		int value = 0;
		long start = System.nanoTime();
		for (int i = 0; i < 100000000; i++) {
			value += i;
		}
		long finish = System.nanoTime();
		System.out.print("Time spent = " + Long.toString(finish - start)
				+ " ns\n");
	}
}