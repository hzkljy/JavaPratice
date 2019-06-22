/*
	声明一个图书类，其数据成员为书名、编号(利用静态变量实现自动编号)、书价，并拥有静态数据成员册数
	、记录图书总数的总册数，在构造方法中利用此静态变量为对象的编号赋值，在主方法中定义多个对象，并求出总册数
*/
class Book {
	private String title; // 图书书名
	private int bid; // 图书编号
	private double price; // 价格
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
		count++; // 记录图书的册数
		this.title = title;
		this.bid = count; // 自动为图书编号
		this.price = price;
	}
	
	/*
	public static int getCount() {
		return count;
	}
	*/
	
	public String getInfo() {
		return "书名：" + this.title + "、编号：" + this.bid + "、书价" + this.price + "、这个图是是第 " + count + " 本图书";
	}

}

public class BookDemo {
	public static void main(String [] args) {
		// 创建对象进行测试
		System.out.println(new Book().getInfo());
		Book book1 = new Book();
		System.out.println(book1.getInfo());
		Book book2 = new Book("Java");
		System.out.println(book2.getInfo());
		Book book3 = new Book(89);
		System.out.println(book3.getInfo());	
		Book book4 = new Book("Python", 52);
		System.out.println(book4.getInfo());

		// 获取总图书个数
		System.out.println("图书总数为：" + Book.count);
	}
}