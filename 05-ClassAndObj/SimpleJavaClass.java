// ������ģ����Ҫ�ǽ��֮ǰѧ����������������е��ܽ��Կ�����Ҳ����Ϊ��Ҫ�Ŀ���������
// ���γ���Ҫ������Ǽ򵥵�Java��ı�дģ�͵�һ��ʵ�֣�����Ӧ��ͨ���˴��뽨�������������˼άģʽ
/*
	���ڼ򵥵�Java�࿪�������Ϊ��
	������һ��Ҫ�����壬������ȷ������ĳһ������
	�������е����Ա���ʹ��private�ؼ��ַ�װ����װ������Ա����ṩsetter() getter()����
	���п����ṩ������������췽��������һ��Ҫ�����޲ι��췽��
	���в���������κ������䣬�����������ݵĻ�ȡ���뷵��
	����ѡ�������ṩһ����ȡ������ϸ��Ϣ�ķ�������ʱ���˷������ƶ���ΪgetInfo()
*/

class Dept {
	private long dnumber; 
	private String dname;
	private String dlocal;
	
	// ���뱣���޲ι��캯��
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
	
	// ���в���������κ�������
	public String getInfo() {
		return "���ű��:" + this.dnumber + "������:" + this.dname + "������:" + this.dlocal;
	}
	
	
}
public class SimpleJavaClass {
	public static void main(String[] args) {
		Dept dept = new Dept(888, "����", "IT��");
		System.out.println(dept.getInfo());
	}
}