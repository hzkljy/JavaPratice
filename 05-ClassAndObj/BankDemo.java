/*
	构造一个银行账户类，类的构成包括以下内容：
	1、数据成员的账户名称、用户的账户余额(private数据类型)
	2、方法包括开户(设置账户名和账户余额)，利用构造方法完成
*/

class BankCard {
	private String name;
	private double money;

	public BankCard() {}

	public BankCard(String name, double money) {
		this.name = name;
		this.money = money;
	}

	// setter mathod

	// getter mathod

	public String getInfo() {
		return "用户名：" + this.name + "余额：" + this.money;
	}
}

public class BankDemo {
	
	public static void main(String[] args) {
		//System.out.println("Hello World!");

		BankCard bankcard = new BankCard("张三", 6800.88);

		System.out.println(bankcard.getInfo());
	}
}
