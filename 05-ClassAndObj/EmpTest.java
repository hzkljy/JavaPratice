/*
	构造方法直接的相互调用主要目的是：提升构造方法中执行代码的可重复性
*/

// 定义一个描述员工信息的类，该类中提供有编号、姓名、部门、工资，同时提供4个构造方法
class Emp {
	private long empno;
	private String ename;
	private String dept;
	private double salary;
	
	// 无参构造方法
	public Emp() {
		this(1000, "无名氏", null, 0.0); // 调用4参构造方法
	}
	
	// 单参构造方法
	public Emp(long empno) {
		this(empno, "新员工", "未定", 0.0); // 调用4参构造方法
	}
	
	// 三参构造方法
	public Emp(long empno, String ename, String dept) {
		this(empno, ename, dept, 2500.0); // 调用4参构造方法
	}
	
	// 4参构造方法
	public Emp(long empno, String ename, String dept, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getInfo() {
		return "雇员编号：" + this.empno +
			   "、雇员姓名：" + this.ename +
			   "、所在部门：" + this.dept +
			   "、基本工资：" + this.salary;
	}
}

public class EmpTest {
	public static void main(String[] args) {
		System.out.println("EmTest");
		Emp emp = new Emp(007, "史密斯", "软件部", 24000);
		System.out.println(emp.getInfo());
	}
	
}