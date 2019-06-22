/*
	���췽��ֱ�ӵ��໥������ҪĿ���ǣ��������췽����ִ�д���Ŀ��ظ���
*/

// ����һ������Ա����Ϣ���࣬�������ṩ�б�š����������š����ʣ�ͬʱ�ṩ4�����췽��
class Emp {
	private long empno;
	private String ename;
	private String dept;
	private double salary;
	
	// �޲ι��췽��
	public Emp() {
		this(1000, "������", null, 0.0); // ����4�ι��췽��
	}
	
	// ���ι��췽��
	public Emp(long empno) {
		this(empno, "��Ա��", "δ��", 0.0); // ����4�ι��췽��
	}
	
	// ���ι��췽��
	public Emp(long empno, String ename, String dept) {
		this(empno, ename, dept, 2500.0); // ����4�ι��췽��
	}
	
	// 4�ι��췽��
	public Emp(long empno, String ename, String dept, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getInfo() {
		return "��Ա��ţ�" + this.empno +
			   "����Ա������" + this.ename +
			   "�����ڲ��ţ�" + this.dept +
			   "���������ʣ�" + this.salary;
	}
}

public class EmpTest {
	public static void main(String[] args) {
		System.out.println("EmTest");
		Emp emp = new Emp(007, "ʷ��˹", "�����", 24000);
		System.out.println(emp.getInfo());
	}
	
}