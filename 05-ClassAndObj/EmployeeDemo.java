/*
	���岢����һ������Ա����Ϣ�� Employee �ࡣ
	Ա����Ϣ��������š�����������нˮ��нˮ�����ʣ�����������нˮ���������������Ĺ����ܶ�
*/
class Employee
{
	// ���������Ϣ
	private String empNumber; // ���
	private String empName; // ����
	private double empSalary; // нˮ
	private double empSalaryGrowthRate; // ������

	// �޲ι���
	public Employee() {}

	public Employee(String empNumber, String empName, double empSalary, double empSalaryGrowthRate) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empSalaryGrowthRate = empSalaryGrowthRate;
	}
	
	// setter����
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
	
	// getter����
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
	
	// ����нˮ������
	public double calEmpSalaryGrowth() {
		return this.empSalary * this.empSalaryGrowthRate;
	}

	// ����������Ĺ����ܺ�
	public double calSalaryGrowthSum() {
		return this.empSalary + this.empSalary * this.empSalaryGrowthRate;
	}
	
	public String getInfo() {
		return "��ţ�" + this.empNumber + "��������" + this.empName + 
				"��нˮ��" + this.empSalary + "��нˮ�����ʣ�" + this.empSalaryGrowthRate;
	}

}


public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		Employee emp = new Employee("10001", "����", 13000, 0.1);
		System.out.println(emp.getInfo());
		System.out.println("нˮ�����" + emp.calEmpSalaryGrowth());
		System.out.println("нˮ�������ܶ�Ϊ��" + emp.calSalaryGrowthSum());
	}
}
