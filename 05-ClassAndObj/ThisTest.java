// 使用this实现本类构造方法的相互调用
// 利用 this() 形式实现构造函数直接的调用
class Person {
	private String name;
	private int age;
	
	// 无参构造函数
	public Person() {
		/*
			如果一个类中存在多个构造方法的话，并且这些构造方法都使用了 this() 相互调用，
			那么至少要保留一个构造方法没有调用其他构造，以作为程序的出口。
		*/
		System.out.println("******一个新的Person对象实例化了******");
		System.out.println("******0无参构造函数******");
	}
	
	// 单参构造函数
	public Person(String name) {
		/*
			注意事项：所有类的构造方法在对象实例的时候被默认调用，而且是在调用普通方法之前调用，
					  所以使用 this() 调用构造方法的操作，一定要放在构造方法的首行
		*/	
		this(); // 调用无参构造函数
		this.name = name;
		System.out.println("******1单参构造函数******");
	}
	
	// 双参构造函数
	public Person(String name, int age) {
		this(name); // 调用单参构造函数
		this.age = age;
		System.out.println("******2双参构造函数******");
	}
	
	public void tellme() {
		// 建议：只要是调用类中成员属性的情况，都要使用 this.属性 的方式来进行表示
		System.out.println("姓名：" + this.name + "、年龄：" + this.age);
	}
}
public class ThisTest {
	public static void main(String[] args) {
		Person per = new Person("张三", 24);
		per.tellme();
		
		/*
			结果：
			******一个新的Person对象实例化了******
			******0无参构造函数******
			******1单参构造函数******
			******2双参构造函数******
			姓名：张三、年龄：24
		*/
		
		
	}
	
}