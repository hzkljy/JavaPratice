class Person {
	private String name;
	private int age;
	
	// this���ñ�������
	/*
		�������ṩ�Ĺ��췽���У��������ƺ����Ա����������ȫ��ͬ������Ϊ����ȷ��ǲ������Ǳ����Ա���ԣ�����Ҫʹ��this�ؼ���������
	*/
	/*
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	*/
	
	// this���ñ�����ͨ����
	public Person(String name, int age) {
		this.setName(name);
		setAge(age);
	}
	
	/*
		���ñ�����ͨ����������ʹ��this.����()�����ҿ����ڹ��캯������ͨ������ʹ��
		���ñ��๹�췽�������ñ��๹�췽��ʹ��this()�������ֻ������ڹ��췽������ʹ��
	*/
	// ���ñ��๹�췽��
	public Person(String name) {
		this(name, age); // ����˫�ι��췽��
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void tell() {
		System.out.println("������" + this.name + "�����䣺" + this.age);
	}
	
}

public class ThisWord {
	public static void main(String[] args) {
		System.out.println("this�ؼ���");
		
		/*
			this�Ǳ���ṹ���õĹؼ��֣���Java��this�ؼ��ֿ�������3��ṹ�ĵ���
				1����ǰ���е����ԣ�this.����
				2����ǰ���еķ���(��ͨ���������췽��)��this(); this.��������();
				3��������ǰ����
		*/
		
		Person per = new Person("����", 18);
		per.tell();
		
		
	}
	
}