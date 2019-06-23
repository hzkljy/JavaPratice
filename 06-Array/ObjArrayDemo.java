class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getInfo() {
		return "���֣�" + this.name + "�����䣺" + this.age;
	}
	
	//setter����
	
	// getter����
}

public class ObjArrayDemo {
	public static void main(String args[]) {
		/*
			��������
			Java�����еĻ������Ͷ����Զ���Ϊ���飬�����˻�������֮�⣬
			��������Ҳ���Զ������飬����������ͳ�Ϊ�������顣
			
			��������Ķ����ʽ��
			�������鶯̬��ʼ����	�� ������������ [] = new �� [����];
			�������龲̬��ʼ����	�� ������������ [] = new �� [����] {ʵ��������ʵ��������,...}; 
		*/
		
		// ʹ�ö�̬��ʼ�������������
		Person per[] = new Person[3];
		per[0] = new Person("����", 20);
		per[1] = new Person("����", 19);
		per[2] = new Person("����", 18);
		
		// �����Ϣ
		for(Person x : per) {
			System.out.println(x.getInfo());
		}
		System.out.println();
		
		// ��̬��ʼ����������
		Person per2[] = new Person[] {
			new Person("С��", 23), 
			new Person("С��", 20), 
			new Person("С��", 24)
		};
		
		// �����Ϣ
		for(Person x : per2) {
			System.out.println(x.getInfo());
		}
		System.out.println();
		
		// ���ô���
		Person per3[] = new Person[] {
			new Person("С��", 26),
			per[0], // ������per[0]
			per[1],
		};
		// �����Ϣ
		for(Person x : per3) {
			System.out.println(x.getInfo());
		}
		System.out.println();		
		
	}
}