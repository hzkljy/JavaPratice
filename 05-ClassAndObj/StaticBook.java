class Book {
	private String title; // 普通成员
	private static int count = 0; // 静态成员
	
	public Book() {
		this("书籍总数：" + count++); // 调用单参构造函数
	}
	public Book(String title) {
		//this.title = title;
		//count++;
		//System.out.println("第" + count + "本图书创建出来。");
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
}

public class StaticBook {
	public static void main(String[] args) {
		//new Book("Java开发实战经典");
		//new Book("Spring实战开发");
		//new Book("Spring微架构实战开发");
		
		System.out.println(new Book("Java开发实战经典").getTitle());
		System.out.println(new Book().getTitle());
		
		System.out.println(new Book("Spring实战开发").getTitle());
		System.out.println(new Book().getTitle());
	}
} 