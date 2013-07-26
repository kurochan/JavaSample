package jitcompile;
public class OptimizeTest2 {
	public static void runTest() {
		int value = 0;
		for (int i = 0; i < 1000000; i++) {
			value += i;
		}
	}

	public static void main(String[] argv) {
		System.out.println(",ns");
		long time = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			long start = System.nanoTime();
			runTest();
			long finish = System.nanoTime();
			System.out.println((i + 1) + "," + Long.toString(finish - start));
		}
		System.out.println("Total" + "," + (System.currentTimeMillis() - time)
				+ "ms");
	}
}