class Employee
{
	private long empNumber;
	private String empName;
	private double empSalary;
	private double empSalaryGrowthRate;

	// ����нˮ������
	public double calEmpSalaryGrowthRate() {
		return empSalaryGrowthRate;
	}

	// ���㹤���ܺ�
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
