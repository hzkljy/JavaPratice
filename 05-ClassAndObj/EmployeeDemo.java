/*
	定义并测试一个代表员工信息的 Employee 类。
	员工信息包括：编号、姓名、基本薪水、薪水增长率，还包括计算薪水增长额及计算增长后的工资总额
*/
class Employee
{
	// 定义基本信息
	private String empNumber; // 编号
	private String empName; // 名字
	private double empSalary; // 薪水
	private double empSalaryGrowthRate; // 增长率

	// 无参构造
	public Employee() {}

	public Employee(String empNumber, String empName, double empSalary, double empSalaryGrowthRate) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empSalaryGrowthRate = empSalaryGrowthRate;
	}
	
	// setter方法
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpSalaryGrowthRate(double empSalaryGrowthRate) {
		this.empSalaryGrowthRate = empSalaryGrowthRate;
	}
	
	// getter方法
	public String getEmpNumber() {
		return this.empNumber;
	}
	public String getEmpName() {
		return this.empName;
	}
	public double getEmpSalary() {
		return this.empSalary;
	}
	public double getEmpSalaryGrowthRate() {
		return empSalaryGrowthRate;
	}
	
	// 计算薪水增长额
	public double calEmpSalaryGrowth() {
		return this.empSalary * this.empSalaryGrowthRate;
	}

	// 计算增长后的工资总和
	public double calSalaryGrowthSum() {
		return this.empSalary + this.empSalary * this.empSalaryGrowthRate;
	}
	
	public String getInfo() {
		return "编号：" + this.empNumber + "、姓名：" + this.empName + 
				"、薪水：" + this.empSalary + "、薪水增长率：" + this.empSalaryGrowthRate;
	}

}


public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		Employee emp = new Employee("10001", "张三", 13000, 0.1);
		System.out.println(emp.getInfo());
		System.out.println("薪水增长额：" + emp.calEmpSalaryGrowth());
		System.out.println("薪水增长后总额为：" + emp.calSalaryGrowthSum());
	}
}
