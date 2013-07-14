package gc;

public class CreateAndRelease {

	/*
	 * 実行時、-verbose:gc オプションをつけて実行すると、GCが発生したタイミングが分かる 例: java -verbose:gc
	 * gc.CreateAndRelease
	 */

	static void printUsedMemory() {
		long usedMemory = (Runtime.getRuntime().totalMemory() - Runtime
				.getRuntime().freeMemory()) / 1024 / 1024;
		System.out.println(usedMemory + "MB");
	}

	static Object makeObject() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("#########################");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Object obj;
		for (int i = 0; i < 10000; i++) {
			if (i % 100 == 0) {
				printUsedMemory();
			}
			obj = makeObject();
			// ループ時毎回GCを行わせるには以下をコメントアウトする
			// 実行速度が非常に遅くなる
			// Runtime.getRuntime().gc();
		}
	}
}