/*
	���һ��Dog�࣬�����֡���ɫ�����������
	���幹�췽������ʼ����Щ���ԣ����巽�����dog��Ϣ
*/

class Dog {
	private String name;
	private String color;
	private int age;
	
	// �޲ι���
	public Dog() {}
	// ���ι��� ���ڳ�ʼ��
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	// getter����
	
	// setter����
	
	// ��ȡ��Ϣ
	public String getInfo() {
		return "���֣�" + this.name + "����ɫ��" + this.color + "�����䣺" + this.age;
	}
}

public class DogDemo {
	public static void main(String [] args) {
		Dog dog = new Dog("С��", "��ɫ", 3);
		System.out.println(dog.getInfo());
	}
}