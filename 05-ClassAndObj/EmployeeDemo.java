class Employee
{
	private long empNumber;
	private String empName;
	private double empSalary;
	private double empSalaryGrowthRate;

	// 计算薪水增加率
	public double calEmpSalaryGrowthRate() {
		return empSalaryGrowthRate;
	}

	// 计算工资总和
	public double calSalarySum() {
		return 0.0;
	}

}


public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
