package autoboxing;

public class AutoBoxingSample {

	public static void main(String[] args) {
		int value1 = 123;
		// オートボクシングにより暗黙的にintがStringに変換されている
		System.out.println("value = " + value1);
		// 明示的に変換するには、以下のようにする
		System.out.println("value = " + String.valueOf(value1));

		// オートボクシングにより暗黙的にintがIntegerに変換されている
		Integer value2 = 123;
		// 明示的に変換するには、以下のようにする
		// (new Integer(123)ではなく、Integer#ValueOf(123)が呼ばれていることに注意)
		Integer value3 = Integer.valueOf(123);

		// オートボクシングにより、暗黙的にIntegerがintに変換されている
		int value4 = value2;
	}
}
