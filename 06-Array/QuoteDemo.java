// ������
class Car { // ��������
	private String name; // ��������
	private double price; // ������ֵ
	private Person person; // ��Ӧ��������һ����
	
	public Car(String name, double price) { // ���촫����������Ϣ
		this.name = name;
		this.price = price;
	}
	
	public void setPerson(Person person) { // �����������˵Ĺ�ϵ
		this.person = person;
	}
	
	public Person getPerson() { // ��ȡ�������˵Ĺ�ϵ
		return this.person;
	}
	
	public String getInfo() { // ��ȡ��������Ϣ
		return "����Ʒ�ƣ�" + this.name + "��������ֵ��" + this.price;
	}
	
	// setter
	
	// getter
	
}

// ��
class Person { // ������
	private String name; // ����
	private int age; // ����
	private Car car; // һ������һ���������û�г���Ϊnull
	
	public Person(String name, int age) { // ���촫���˵���Ϣ
		this.name = name;
		this.age = age;
	}
	
	public void setCar(Car car){ // ���������������Ĺ�ϵ
		this.car = car;
	}
	
	public Car getCar() { // ��ȡ���������Ĺ�ϵ
		return this.car;
	}
	
	public String getInfo() { // ��ȡ�˵���Ϣ
		return "������" + this.name + "�����䣺" + this.age;
	}
	
	// getter
	
	// setter
	
}

public class QuoteDemo{
	public static void main(String args[]) {
		/*
			���ô���Ӧ�ð���
			���ô���������Java��Ŀ����Ϊ���ĵ����ݣ�ͬʱҲ����ʵ�ʵĿ�������Ϊ������һ�ֲ�����
			�ڶ����˽��������ĸ���󣬾Ϳ��Ի��ڴ˸������Java��ʵ��һЩ��ʵ�������ϵģ�͡�
			
			����ʵ�Ŀ��������ϣ����ǿ�������һ�����ﹲ�ԵĽṹ�塣
			�ּ�����Ҫ��������һ�ֹ�ϵ��һ����ӵ��һ������
			��ʱ����Ҫ����2���ࣺPerson��Car�����ͨ�����õ���ʽ���ñ˴˵Ĺ�ϵ
		*/
		
		// ��һ���������������ñ˴˵Ĺ�ϵ
		Person person = new Person("����", 30); // ʵ����Person����
		Car car = new Car("����", 400000); // ʵ����Car����
		
		person.setCar(car); // һ������һ������
		car.setPerson(person); // һ����������һ����
		
		// ��2�������ݹ�ϵ��ȡ����
		// person.getCar().getInfo() �����ڴ������ı�д
		System.out.println(person.getCar().getInfo()); // ͨ���˻�ȡ��������Ϣ
		System.out.println(car.getPerson().getInfo()); // ͨ��������ȡ�˵���Ϣ
		
	}
}