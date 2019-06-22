/*
	设置一个表示User的类
	类中的变量有：用户名、口令和记录用户个数的变量
	定义3个构造方法(无参、为用户名赋值、为用户名和口令赋值)
	获取和设置口令的方法和返回类信息的方法
*/

class User {
	private String uid;
	private String passwd;
	private static int count = 0;
	
	// 无参构造
	public User() {
		this("NO-UID", "NO-PASSWD");
	}
	
	// 单参构造 为用户名赋值
	public User(String uid) {
		this(uid, "NO-PASSWD");
	}
	
	// 双参构造 为用户名和口令赋值
	public User(String uid, String passwd) {
		this.uid = uid; // 用户名
		this.passwd = passwd; // 为口令赋值
		count++; // 用户数加1
		
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
		return "用户名：" + this.uid + "、口令：" + this.passwd + "、用户个数：" + count;
	}
}

public class UserDemo {
	public static void main(String [] args) {
		User user1 = new User();
		System.out.println(user1.getInfo());
		User user2 = new User("张三");
		System.out.println(user2.getInfo());
		User user3 = new User("李四", "123abc");
		System.out.println(user3.getInfo());
		
		// 不创建变量形式调用
		System.out.println(new User().getInfo());
		
	}
}