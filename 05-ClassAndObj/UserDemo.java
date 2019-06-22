/*
	����һ����ʾUser����
	���еı����У��û���������ͼ�¼�û������ı���
	����3�����췽��(�޲Ρ�Ϊ�û�����ֵ��Ϊ�û����Ϳ��ֵ)
	��ȡ�����ÿ���ķ����ͷ�������Ϣ�ķ���
*/

class User {
	private String uid;
	private String passwd;
	private static int count = 0;
	
	// �޲ι���
	public User() {
		this("NO-UID", "NO-PASSWD");
	}
	
	// ���ι��� Ϊ�û�����ֵ
	public User(String uid) {
		this(uid, "NO-PASSWD");
	}
	
	// ˫�ι��� Ϊ�û����Ϳ��ֵ
	public User(String uid, String passwd) {
		this.uid = uid; // �û���
		this.passwd = passwd; // Ϊ���ֵ
		count++; // �û�����1
		
	}
	
	public void setuid(String uid) {
		this.uid = uid;
	} 
	
	public void setpasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getuid() {
		return this.uid;
	}
	
	public String getpasswd() {
		return this.passwd;
	}
	
	public static int getcount() {
		return count;
	}
	
	public String getInfo() {
		return "�û�����" + this.uid + "�����" + this.passwd + "���û�������" + count;
	}
}

public class UserDemo {
	public static void main(String [] args) {
		User user1 = new User();
		System.out.println(user1.getInfo());
		User user2 = new User("����");
		System.out.println(user2.getInfo());
		User user3 = new User("����", "123abc");
		System.out.println(user3.getInfo());
		
		// ������������ʽ����
		System.out.println(new User().getInfo());
		
	}
}