package thread;

interface BankAccount {
	public int getBalances();
	public int depositMoney(String name, int money);
}

class BadBankAccount implements BankAccount {
	private int money;

	public int getBalances() {
		return money;
	}

	public int depositMoney(String name, int money) {
		int tmp = this.money;
		System.out.println(name + ": 入金前の残高は " + tmp + "円です");
		System.out.println(name + ": 入金作業中です");
		tmp += money;
		this.money = tmp;
		System.out.println(name + ": 入金後の残高は " + tmp + "円です");
		return tmp;
	}
}

class GoodBankAccount implements BankAccount {
	private int money;

	public int getBalances() {
		return money;
	}

	public synchronized int depositMoney(String name, int money) {
		int tmp = this.money;
		System.out.println(name + ": 入金前の残高は " + tmp + "円です");
		System.out.println(name + ": 入金作業中です");
		tmp += money;
		this.money = tmp;
		System.out.println(name + ": 入金後の残高は " + tmp + "円です");
		return tmp;
	}
}