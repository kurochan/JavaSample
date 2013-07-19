package output;

public class StandardOutput {

	public static void main(String[] args) {
		// 末尾に改行が付加される
		System.out.println("Hello! World");
		System.out.println(123);
		System.out.println("value is " + 123);

		// 末尾に改行は付加されない
		System.out.print("Hello! ");
		System.out.print("World \n");

		// C言語のprintfみたいな要領で使える
		System.out.printf("value is %d %d\n", 123, 456);
		// 桁数を指定できる(小数点の指定桁数以上は四捨五入される)
		System.out.printf("value is %5.2f %5.2f\n", 123.4567, 54.321);
		
		// エラー出力
		System.err.println("エラー出力の例");
	}
}
