
class Chinese {
	private String name; // ��ͨ��Ա����
	private int age;
	
	// static��������
	static String country = "�л����񹲺͹�"; // ��̬��Ա���� ������
	
	public Chinese() {}
	public Chinese(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// static���巽��
	public static void setCountry(String c) {
		// ע�⣺static����ķ������治����ʹ��this�ؼ���
		country = c;
	}
	
	public String getInfo() {
		//return "������" + this.name + "�����䣺" + this.age + "��������" + this.country; 
		return "������" + this.name + "�����䣺" + this.age + "��������" + Chinese.country; // ʹ�� Chinese.country ����
	}
	
}
public class StaticDemo {
	public static void main(String[] args) {
		/*
			static�ؼ���
			static��һ�����ڳ���ṹ�Ĺؼ��֣��˹ؼ��ֿ�������ȫ�����Ժ�ȫ�ַ�������������Ҫ�ص��ǿ��Ա������ʵ���������ƣ���û��ʵ���������ʱ�����ֱ�ӽ��д���ṹ�ķ���
			�����Ҫ���е�ĳ�����Զ���Ϊ��������(���ж��󶼿���ʹ�õ�����)�����������������ǰ����static�ؼ���
		*/
		
		Chinese perA = new Chinese("����", 18);
		Chinese perB = new Chinese("����", 20);
		Chinese perC = new Chinese("����", 24);
		
		perA.country = "ΰ����й�"; // �޸��˹������� �������Ա�����ȫ����������
		System.out.println(perA.getInfo());
		System.out.println(perB.getInfo());
		System.out.println(perC.getInfo());
		
		/*
			static��������ȫ�����ԣ�����ȫ�����Գ��˿�����ʵ����������⣬����ص����ڿ���ֱ���������Ʋ�����û��ʵ���������������½��е���
		*/
		System.out.println("ֱ�ӷ���static���ԣ�" + Chinese.country);
		
		/*
			ʹ��static������������ݲ��ڶ��ڴ��б��棬���Ǳ�����ȫ��������
			ʹ��static������������ݱ�ʾ�����ԣ������Կ�����������ֱ�ӽ��е���(��Ȼ���Խ���ʵ����������ã�������Java������׼�в��ᳫʹ�ô����ʽ)
			static������Ȼ���������У������������û��ʵ�������ʱ����е���(��ͨ���Ա����ڶ��ڴ����static���Ա�����ȫ��������֮��)
		*/
		
		/*
			static���˿��Զ������ԣ������Զ��巽����һ��ʹ����static���巽������ô�˷���������û��ʵ�������ʱ����е���
		*/
		Chinese.setCountry("666���й�");
		System.out.println("������" + Chinese.country);
		System.out.println(perA.getInfo());
		System.out.println(perB.getInfo());
		System.out.println(perC.getInfo());		
		
		/*
			static�����ͷ�static������
			static����ķ������ܵ��÷�static�ķ���������
			��static����ķ������Ե���static�����Ի򷽷�
			ʹ��static��������Ժͷ�����������û��ʵ����ʱ��ʹ��(���û��ʵ������Ҳ��û���˱�ʾ��ǰ�����this������static�����ڲ��޷�ʹ��this�ؼ���ԭ������ڴ�)
			��static��������Ժͷ���������ʵ������֮����ܽ��е���
		*/
	}
}