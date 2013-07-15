package thread;

public class ParallelAdd extends Thread {
	public double sum;
	public double data[];
	public int srcPos;
	public int length;

	public ParallelAdd(double data[], int srcPos, int length) {
		this.sum = 0;
		this.data = data;
		this.srcPos = srcPos;
		this.length = length;
	}

	public void run() {
		double tmp;
		for (int i = 0; i < length; i++) {
			tmp = sum + data[srcPos + i];
			sum = tmp;
		}
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int threads = 3;
		System.out.println(threads + "スレッドで実行します");

		double data[] = new double[110000000];
		for (int i = 0; i < data.length; i++) {
			data[i] = 1;
		}
		System.out.println(data.length + "件のデータを用意しました");

		ParallelAdd pa[] = new ParallelAdd[threads];
		int quot = data.length / threads;
		int rem = data.length % threads;
		int pos = 0;
		for (int i = 0; i < pa.length; i++) {
			if (rem > 0) {
				pa[i] = new ParallelAdd(data, pos, quot + 1);
				pos += quot + 1;
				rem--;
			} else {
				pa[i] = new ParallelAdd(data, pos, quot);
				pos += quot;
			}
			System.out.println("スレッド" + i + ": " + pa[i].length + "件");
		}

		long calcStartTime = System.currentTimeMillis();
		for (int i = 0; i < pa.length; i++) {
			pa[i].start();
		}

		try {
			for (int i = 0; i < pa.length; i++) {
				pa[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long sum = 0;
		for (int i = 0; i < pa.length; i++) {
			sum += pa[i].sum;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("---計算終了---");
		System.out.println("合計: " + sum);
		System.out.println("初期化時間: " + (calcStartTime - startTime) + "ms");
		System.out.println("計算時間: " + (endTime - calcStartTime) + "ms");
		System.out.println("実行時間: " + (endTime - startTime) + "ms");
	}
}