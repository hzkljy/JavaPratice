// 汽车类
class Car { // 描述汽车
	private String name; // 汽车名称
	private double price; // 汽车价值
	private Person person; // 车应该是属于一个人
	
	public Car(String name, double price) { // 构造传入汽车的信息
		this.name = name;
		this.price = price;
	}
	
	public void setPerson(Person person) { // 设置汽车和人的关系
		this.person = person;
	}
	
	public Person getPerson() { // 获取汽车和人的关系
		return this.person;
	}
	
	public String getInfo() { // 获取汽车的信息
		return "汽车品牌：" + this.name + "、汽车价值：" + this.price;
	}
	
	// setter
	
	// getter
	
}

// 人
class Person { // 描述人
	private String name; // 姓名
	private int age; // 年龄
	private Car car; // 一个人有一辆车，如果没有车则为null
	
	public Person(String name, int age) { // 构造传入人的信息
		this.name = name;
		this.age = age;
	}
	
	public void setCar(Car car){ // 设置人呢与汽车的关系
		this.car = car;
	}
	
	public Car getCar() { // 获取人与汽车的关系
		return this.car;
	}
	
	public String getInfo() { // 获取人的信息
		return "姓名：" + this.name + "、年龄：" + this.age;
	}
	
	// getter
	
	// setter
	
}

public class QuoteDemo{
	public static void main(String args[]) {
		/*
			引用传递应用案例
			引用传递是整个Java项目中最为核心的内容，同时也是在实际的开发中最为常见的一种操作，
			在读者了解对象数组的概念后，就可以基于此概念与简单Java类实现一些现实的事物关系模型。
			
			在现实的开发意义上，类是可以描述一类事物共性的结构体。
			现假设需要描述这样一种关系：一个人拥有一辆汽车
			此时就需要定义2个类：Person和Car，随后通过引用的形式配置彼此的关系
		*/
		
		// 第一步：声明对象并设置彼此的关系
		Person person = new Person("张三", 30); // 实例化Person对象
		Car car = new Car("奔驰", 400000); // 实例化Car对象
		
		person.setCar(car); // 一个人有一辆汽车
		car.setPerson(person); // 一个汽车属于一个人
		
		// 第2步：根据关系获取数据
		// person.getCar().getInfo() 是属于代码链的编写
		System.out.println(person.getCar().getInfo()); // 通过人获取汽车的信息
		System.out.println(car.getPerson().getInfo()); // 通过汽车获取人的信息
		
	}
}