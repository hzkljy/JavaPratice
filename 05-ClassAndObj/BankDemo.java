/*
	����һ�������˻��࣬��Ĺ��ɰ����������ݣ�
	1�����ݳ�Ա���˻����ơ��û����˻����(private��������)
	2��������������(�����˻������˻����)�����ù��췽�����
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
		return "�û�����" + this.name + "��" + this.money;
	}
}

public class BankDemo {
	
	public static void main(String[] args) {
		//System.out.println("Hello World!");

		BankCard bankcard = new BankCard("����", 6800.88);

		System.out.println(bankcard.getInfo());
	}
}
