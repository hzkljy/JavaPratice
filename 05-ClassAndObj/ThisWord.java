class Person {
	private String name;
	private int age;
	
	// this调用本类属性
	/*
		本程序提供的构造方法中，参数名称和类成员属性名称完全相同，所以为了明确标记操作的是本类成员属性，就需要使用this关键字来设置
	*/
	/*
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	*/
	
	// this调用本类普通方法
	public Person(String name, int age) {
		this.setName(name);
		setAge(age);
	}
	
	/*
		调用本类普通方法：可以使用this.方法()，并且可以在构造函数与普通方法中使用
		调用本类构造方法：调用本类构造方法使用this()，此语句只允许放在构造方法首行使用
	*/
	// 调用本类构造方法
	public Person(String name) {
		this(name, age); // 调用双参构造方法
		
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
		System.out.println("姓名：" + this.name + "、年龄：" + this.age);
	}
	
}

public class ThisWord {
	public static void main(String[] args) {
		System.out.println("this关键字");
		
		/*
			this是本类结构调用的关键字，在Java中this关键字可以描述3类结构的调用
				1、当前类中的属性：this.属性
				2、当前类中的方法(普通方法、构造方法)：this(); this.方法名称();
				3、描述当前对象
		*/
		
		Person per = new Person("张三", 18);
		per.tell();
		
		
	}
	
}