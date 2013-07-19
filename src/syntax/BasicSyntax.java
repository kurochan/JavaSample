package syntax;

// 一行コメント
// コメントは基本的にどこでも書けます
/*
 * 複数行コメント
 */
public class BasicSyntax {

	public static void main(String[] args) {
		int n = 10;
		// if文の例
		if (n == 10) {
			System.out.println("nは10です！");
		}

		if (n == 20) {
			System.out.println("nは20です！");
		} else {
			System.out.println("nは20ではありません！");
		}

		System.out.println("----------");

		// for文の例
		for (int i = 0; i < 10; i++) {
			System.out.println("iは " + i + "です！");
		}

		System.out.println("----------");

		// while文の例
		while (n > 0) {
			n = n - 1;
			System.out.println("nは" + n + "です！");
		}

		System.out.println("----------");

		// do-while文の例
		n = 10;
		do {
			n = n - 1;
			System.out.println("nは" + n + "です！");
		} while (n > 0);
	}

}
