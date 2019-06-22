
class Chinese {
	private String name; // 普通成员属性
	private int age;
	
	// static定义属性
	static String country = "中华人民共和国"; // 静态成员属性 类属性
	
	public Chinese() {}
	public Chinese(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// static定义方法
	public static void setCountry(String c) {
		// 注意：static定义的方法里面不允许使用this关键字
		country = c;
	}
	
	public String getInfo() {
		//return "姓名：" + this.name + "、年龄：" + this.age + "、国籍：" + this.country; 
		return "姓名：" + this.name + "、年龄：" + this.age + "、国籍：" + Chinese.country; // 使用 Chinese.country 更好
	}
	
}
public class StaticDemo {
	public static void main(String[] args) {
		/*
			static关键字
			static是一个用于程序结构的关键字，此关键字可以用于全局属性和全局方法的声明，主要特点是可以避免对象实例化的限制，在没有实例化对象的时候可以直接进行此类结构的访问
			如果想要类中的某个属性定义为公共属性(所有对象都可以使用的属性)，则可以在声明属性前加上static关键字
		*/
		
		Chinese perA = new Chinese("张三", 18);
		Chinese perB = new Chinese("李四", 20);
		Chinese perC = new Chinese("王五", 24);
		
		perA.country = "伟大的中国"; // 修改了公共属性 公共属性保存在全局数据区中
		System.out.println(perA.getInfo());
		System.out.println(perB.getInfo());
		System.out.println(perC.getInfo());
		
		/*
			static描述的是全局属性，对于全局属性除了可以利实例对象调用外，最大特点在于可以直接利类名称并且在没有实例对象产生的情况下进行调用
		*/
		System.out.println("直接访问static属性：" + Chinese.country);
		
		/*
			使用static定义的属性内容不在堆内存中保存，而是保存在全局数据区
			使用static定义的属性内容表示类属性，类属性可以由类名称直接进行调用(虽然可以进行实例化对象调用，但是在Java开发标准中不提倡使用此类格式)
			static属性虽然定义在类中，但是其可以在没有实例对象的时候进行调用(普通属性保存在堆内存里，而static属性保存在全局数据区之中)
		*/
		
		/*
			static除了可以定义属性，还可以定义方法，一旦使用了static定义方法，那么此方法可以在没有实例对象的时候进行调用
		*/
		Chinese.setCountry("666的中国");
		System.out.println("国籍：" + Chinese.country);
		System.out.println(perA.getInfo());
		System.out.println(perB.getInfo());
		System.out.println(perC.getInfo());		
		
		/*
			static方法和非static方法：
			static定义的方法不能调用非static的方法或属性
			非static定义的方法可以调用static的属性或方法
			使用static定义的属性和方法，可以在没有实例的时候使用(如果没有实例对象，也就没有了表示当前对象的this，所以static方法内部无法使用this关键字原因就在于此)
			非static定义的属性和方法，必须实例对象之后才能进行调用
		*/
	}
}