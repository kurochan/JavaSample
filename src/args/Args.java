package args;

public class Args {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("no args");
			return;
		}
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
