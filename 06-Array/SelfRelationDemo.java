class Car {
	private String name;
	private double price;
	private Person person;
	
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public String getInfo() {
		return "����Ʒ�ƣ�" + this.name + "��������ֵ��" + this.price;
	}
}

class Person {
	private String name;
	private int age;
	private Car car;
	
	private Person children[]; // һ�����ж������
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return this.car;
	}
	
	public void setChildren(Person children[]) { // �������뺢�ӵĹ���
		this.children = children;
	}
	
	public Person[] getChildren() { // ��ȡ���뺢�ӵĹ���
		return children;
	}
	
	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age;
	}
	
}


public class SelfRelationDemo {
	public static void main(String args[]) {
		/*
			��������ṹ
			��ͬ����֮�������������������ͬ������ʵ�ֹ���
			
			���磺���ڼ���һ���˻���һ������ôÿ���˿��ܻ������Լ�����Ů������ŮҲ������һ�������ʱ��ͻ�����������������ʽ������Ա����Ĺ�ϵ
		*/
		
		// ��1���������������ñ˴�֮��Ĺ�ϵ
		Person person = new Person("����", 28); // ʵ��Person����
		Person childA = new Person("����", 29);
		Person childB = new Person("����", 30);
		
		childA.setCar(new Car("������", 1000000)); // ��������
		childB.setCar(new Car("����", 300000));
		
		person.setChildren(new Person[] {childA, childB}); // һ�����ж������
		
		Car car = new Car("����", 2000000);
		person.setCar(car);
		car.setPerson(person);
		
		// ��2�������ݹ�ϵ��ȡ��Ϣ
		System.out.println(person.getCar().getInfo());
		System.out.println(car.getPerson().getInfo());
		
		// ��ȡ���ӵ���Ϣ
		Person childs[] = person.getChildren();
		
		for(Person per : childs) {
			System.out.println("\t|- " + per.getInfo());
			System.out.println("\t\t|- " + per.getCar().getInfo());
		}
	}
}