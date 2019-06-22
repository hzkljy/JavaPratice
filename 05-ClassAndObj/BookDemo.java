/*
	����һ��ͼ���࣬�����ݳ�ԱΪ���������(���þ�̬����ʵ���Զ����)����ۣ���ӵ�о�̬���ݳ�Ա����
	����¼ͼ���������ܲ������ڹ��췽�������ô˾�̬����Ϊ����ı�Ÿ�ֵ�����������ж��������󣬲�����ܲ���
*/
class Book {
	private String title; // ͼ������
	private int bid; // ͼ����
	private double price; // �۸�
	static int count = 0;
	
	public Book() {
		this("NO-title", 0.0);
	}
	
	public Book(String title) {
		this(title, 0.0);
	}
	
	public Book(double price) {
		this("NO-title", price);
	}
	
	public Book(String title, double price) {
		count++; // ��¼ͼ��Ĳ���
		this.title = title;
		this.bid = count; // �Զ�Ϊͼ����
		this.price = price;
	}
	
	/*
	public static int getCount() {
		return count;
	}
	*/
	
	public String getInfo() {
		return "������" + this.title + "����ţ�" + this.bid + "�����" + this.price + "�����ͼ���ǵ� " + count + " ��ͼ��";
	}

}

public class BookDemo {
	public static void main(String [] args) {
		// ����������в���
		System.out.println(new Book().getInfo());
		Book book1 = new Book();
		System.out.println(book1.getInfo());
		Book book2 = new Book("Java");
		System.out.println(book2.getInfo());
		Book book3 = new Book(89);
		System.out.println(book3.getInfo());	
		Book book4 = new Book("Python", 52);
		System.out.println(book4.getInfo());

		// ��ȡ��ͼ�����
		System.out.println("ͼ������Ϊ��" + Book.count);
	}
}