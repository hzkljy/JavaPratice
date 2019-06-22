/*
	代码块是在程序之中使用 {} 定义起来的一段程序，而根据代码块声明的位置以及声明关键字的不同，代码块分为4种：
	普通代码块、构造代码块、静态代码块、同步代码块(同步代码块14章讲)
	普通代码块：定义在方法中的代码块，利用此类代码块可以解决代码块在一个方法中过长导致出现重复变量定义的问题
	构造代码块：将代码块定义在一个类中
	静态代码块：也是定义在类中的，如果一个构造代码块上使用了static关键字进行定义的话，内么就表示静态代码块
*/
class Message {
	public static String getCountry() {
		return "www.baidu.com";
	}
}

class Person {
	private static String country;
	static {
		country = Message.getCountry();
		System.out.println(country);
	}
	
	//public Person() {
	//	System.out.println("[构造方法]Person类构造方法执行");
	//}
	//// 构造代码块 
	//{
	//	System.out.println("[构造块]Person类构造块执行");
	//}
	//// 静态代码块
	//static {
	//	System.out.println("[静态块]静态块执行");
	//}
}



public class CodeBlock {
	

		
	public static void main(String[] args) {
		//if(true) {
		//	int x = 10;
		//	System.out.println("x = " + x);
		//}
		//int x = 100;
		//System.out.println("x = " + x);
		//
		//// 普通代码块
		//{
		//	int y = 1;
		//	System.out.println("y = " + y);
		//}
		//int y = 100;
		//System.out.println("y = " + y);
		//
		//new Person();
		//new Person();
		/*
		[构造块]Person类构造块执行
		[构造方法]Person类构造方法执行
		[构造块]Person类构造块执行
		[构造方法]Person类构造方法执行
		结论：每一次实例新的对象都会执行，而且是在构造方法之前执行
		*/
		
		//静态块 
		/*
		[静态块]静态块执行
		[构造块]Person类构造块执行
		[构造方法]Person类构造方法执行
		[构造块]Person类构造块执行
		[构造方法]Person类构造方法执行
		结论：静态块的优先级优于构造代码块
		*/
		
		// 利用静态代码块可以实现一些公关代码的初始化操作
		new Person();
		

		
	}
	
	// 在主类中定义静态代码
	static {
		System.out.println("***************亿道数码******************");
	}
		
}