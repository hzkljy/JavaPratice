class Car {
	private String name;
	private double price;
	private Person person;
	
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public String getInfo() {
		return "汽车品牌：" + this.name + "、汽车价值：" + this.price;
	}
}

class Person {
	private String name;
	private int age;
	private Car car;
	
	private Person children[]; // 一个人有多个孩子
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return this.car;
	}
	
	public void setChildren(Person children[]) { // 设置人与孩子的关联
		this.children = children;
	}
	
	public Person[] getChildren() { // 获取人与孩子的关联
		return children;
	}
	
	public String getInfo() {
		return "姓名：" + this.name + "、年龄：" + this.age;
	}
	
}


public class SelfRelationDemo {
	public static void main(String args[]) {
		/*
			自身关联结构
			不同的类之间允许关联，自身类中同样可以实现关联
			
			例如：现在假设一个人会有一辆，内么每个人可能还会有自己的子女，而子女也可能有一辆，这个时候就会可以利自身关联的形式描述人员后代的关系
		*/
		
		// 第1步：声明对象并设置彼此之间的关系
		Person person = new Person("张三", 28); // 实例Person对象
		Person childA = new Person("李四", 29);
		Person childB = new Person("王五", 30);
		
		childA.setCar(new Car("法拉利", 1000000)); // 匿名对象
		childB.setCar(new Car("宝马", 300000));
		
		person.setChildren(new Person[] {childA, childB}); // 一个人有多个孩子
		
		Car car = new Car("奔驰", 2000000);
		person.setCar(car);
		car.setPerson(person);
		
		// 第2步：根据关系获取信息
		System.out.println(person.getCar().getInfo());
		System.out.println(car.getPerson().getInfo());
		
		// 获取孩子的信息
		Person childs[] = person.getChildren();
		
		for(Person per : childs) {
			System.out.println("\t|- " + per.getInfo());
			System.out.println("\t\t|- " + per.getCar().getInfo());
		}
	}
}