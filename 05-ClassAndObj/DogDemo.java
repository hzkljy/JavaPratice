/*
	设计一个Dog类，有名字、颜色、年龄等属性
	定义构造方法来初始化这些属性，定义方法输出dog信息
*/

class Dog {
	private String name;
	private String color;
	private int age;
	
	// 无参构造
	public Dog() {}
	// 三参构造 用于初始化
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	// getter方法
	
	// setter方法
	
	// 获取信息
	public String getInfo() {
		return "名字：" + this.name + "、颜色：" + this.color + "、年龄：" + this.age;
	}
}

public class DogDemo {
	public static void main(String [] args) {
		Dog dog = new Dog("小黑", "黑色", 3);
		System.out.println(dog.getInfo());
	}
}