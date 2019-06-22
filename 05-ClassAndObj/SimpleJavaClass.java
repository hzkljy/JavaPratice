// 本代码模型主要是结合之前学过的面向对象概念进行的总结性开发，也是最为重要的开发技术。
// 本课程主要讲解的是简单的Java类的编写模型第一层实现，读者应该通过此代码建立基础面向对象思维模式
/*
	对于简单的Java类开发其核心为：
	类名称一定要有意义，可以明确地描述某一类事物
	类中所有的属性必须使用private关键字封装，封装后的属性必须提供setter() getter()方法
	类中可以提供有无数多个构造方法，但是一定要保留无参构造方法
	类中不允许出现任何输出语句，但是所有内容的获取必须返回
	【可选】可以提供一个获取对象详细信息的方法，暂时将此方法名称定义为getInfo()
*/

class Dept {
	private long dnumber; 
	private String dname;
	private String dlocal;
	
	// 必须保留无参构造函数
	public Dept() {
		
	}
	
	public Dept(long dnumber, String dname, String dlocal) {
		this.dnumber =  dnumber;
		this.dname = dname;
		this.dlocal = dlocal;
	}
	
	public long getDnumber() {
		return this.dnumber;
	}
	public String getDname() {
		return this.dname;
	}
	public String getDlocal() {
		return this.dlocal;
	}
	public void setDnumber(long dnumber) {
		this.dnumber = dnumber;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setDlocal(String dlocal) {
		this.dlocal = dlocal;
	}
	
	// 类中不允许出现任何输出语句
	public String getInfo() {
		return "部门编号:" + this.dnumber + "、姓名:" + this.dname + "、部门:" + this.dlocal;
	}
	
	
}
public class SimpleJavaClass {
	public static void main(String[] args) {
		Dept dept = new Dept(888, "张三", "IT部");
		System.out.println(dept.getInfo());
	}
}