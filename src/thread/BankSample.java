package thread;

public class BankSample extends Thread {
	private String name;
	private BankAccount bank;

	BankSample(String name, BankAccount bank) {
		this.name = name;
		this.bank = bank;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + ": " + (i + 1) + " 回目");
			bank.depositMoney(name, 100);
		}
	}

	public static void main(String[] args) {
		 BankAccount bank = new BadBankAccount();
		//BankAccount bank = new GoodBankAccount();
		System.out.println("口座を初期化しました");
		System.out.println("残高は " + bank.getBalances() + "円です");

		BankSample a = new BankSample("A", bank);
		BankSample b = new BankSample("B", bank);
		BankSample c = new BankSample("C", bank);

		a.start();
		b.start();
		c.start();
		try {
			a.join();
			b.join();
			c.join();
		} catch (InterruptedException e) {
		}

		System.out.println("処理が終わりました");
		System.out.println("残高は " + bank.getBalances() + "円です");
	}
}