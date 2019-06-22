class Book {
	private String title; // ��ͨ��Ա
	private static int count = 0; // ��̬��Ա
	
	public Book() {
		this("�鼮������" + count++); // ���õ��ι��캯��
	}
	public Book(String title) {
		//this.title = title;
		//count++;
		//System.out.println("��" + count + "��ͼ�鴴��������");
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
}

public class StaticBook {
	public static void main(String[] args) {
		//new Book("Java����ʵս����");
		//new Book("Springʵս����");
		//new Book("Spring΢�ܹ�ʵս����");
		
		System.out.println(new Book("Java����ʵս����").getTitle());
		System.out.println(new Book().getTitle());
		
		System.out.println(new Book("Springʵս����").getTitle());
		System.out.println(new Book().getTitle());
	}
} 