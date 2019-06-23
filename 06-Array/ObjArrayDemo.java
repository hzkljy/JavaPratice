class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getInfo() {
		return "名字：" + this.name + "、年龄：" + this.age;
	}
	
	//setter方法
	
	// getter方法
}

public class ObjArrayDemo {
	public static void main(String args[]) {
		/*
			对象数组
			Java中所有的基本类型都可以定义为数组，即除了基本类型之外，
			引用类型也可以定义数组，这样的数组就称为对象数组。
			
			对象数组的定义格式：
			对象数组动态初始化：	类 对象数组名称 [] = new 类 [长度];
			对象数组静态初始化：	类 对象数组名称 [] = new 类 [长度] {实例化对象，实例化对象,...}; 
		*/
		
		// 使用动态初始化定义对象数组
		Person per[] = new Person[3];
		per[0] = new Person("张三", 20);
		per[1] = new Person("李四", 19);
		per[2] = new Person("王五", 18);
		
		// 输出信息
		for(Person x : per) {
			System.out.println(x.getInfo());
		}
		System.out.println();
		
		// 静态初始化对象数组
		Person per2[] = new Person[] {
			new Person("小明", 23), 
			new Person("小花", 20), 
			new Person("小黑", 24)
		};
		
		// 输出信息
		for(Person x : per2) {
			System.out.println(x.getInfo());
		}
		System.out.println();
		
		// 引用传入
		Person per3[] = new Person[] {
			new Person("小海", 26),
			per[0], // 引用了per[0]
			per[1],
		};
		// 输出信息
		for(Person x : per3) {
			System.out.println(x.getInfo());
		}
		System.out.println();		
		
	}
}