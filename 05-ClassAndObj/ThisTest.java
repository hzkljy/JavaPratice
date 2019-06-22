// ʹ��thisʵ�ֱ��๹�췽�����໥����
// ���� this() ��ʽʵ�ֹ��캯��ֱ�ӵĵ���
class Person {
	private String name;
	private int age;
	
	// �޲ι��캯��
	public Person() {
		/*
			���һ�����д��ڶ�����췽���Ļ���������Щ���췽����ʹ���� this() �໥���ã�
			��ô����Ҫ����һ�����췽��û�е����������죬����Ϊ����ĳ��ڡ�
		*/
		System.out.println("******һ���µ�Person����ʵ������******");
		System.out.println("******0�޲ι��캯��******");
	}
	
	// ���ι��캯��
	public Person(String name) {
		/*
			ע�����������Ĺ��췽���ڶ���ʵ����ʱ��Ĭ�ϵ��ã��������ڵ�����ͨ����֮ǰ���ã�
					  ����ʹ�� this() ���ù��췽���Ĳ�����һ��Ҫ���ڹ��췽��������
		*/	
		this(); // �����޲ι��캯��
		this.name = name;
		System.out.println("******1���ι��캯��******");
	}
	
	// ˫�ι��캯��
	public Person(String name, int age) {
		this(name); // ���õ��ι��캯��
		this.age = age;
		System.out.println("******2˫�ι��캯��******");
	}
	
	public void tellme() {
		// ���飺ֻҪ�ǵ������г�Ա���Ե��������Ҫʹ�� this.���� �ķ�ʽ�����б�ʾ
		System.out.println("������" + this.name + "�����䣺" + this.age);
	}
}
public class ThisTest {
	public static void main(String[] args) {
		Person per = new Person("����", 24);
		per.tellme();
		
		/*
			�����
			******һ���µ�Person����ʵ������******
			******0�޲ι��캯��******
			******1���ι��캯��******
			******2˫�ι��캯��******
			���������������䣺24
		*/
		
		
	}
	
}