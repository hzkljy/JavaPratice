public class Method {
	public static void main(String[] args) {
		System.out.println("方法");
		
		// 方法是一种代码的重用技术，实现可以重复使用
		// 第一个字母小写，后面的每个字母第一个字母需要大写
		// public static 修饰的方法可以被主方法直接调用
		printInfo();
		printInfo();
		
		String result = payAndGet(99.9);
		System.out.println(result);
		System.out.println(payAndGet(9.9));
		
		sale(3);
		sale(-3);
		
		// 方法的重载
		int resultA = sum(10, 20);
		int resultB = sum(10, 20, 30);
		int resultC = sum(10.2, 10.3);
		System.out.println(resultA);
		System.out.println(resultB);
		System.out.println(resultC);
		
		// 递归调用计算1~100的和
		int resultSum = sum(100);
		System.out.println(resultSum);
		
		// 1!+2!+3!+...+99!
		System.out.println(sumNum(99));
		
		// 1!+2!+3!+4！
		System.out.println(sumNum(4));
		
	}
	
	// Java里面方法的参数不能为void，但是可以省略不写
	// 定义一个无参数无返回值的方法
	public static void printInfo() {
		System.out.println("********************");
		System.out.println("*****printInfo******");
		System.out.println("********************");
	}
	
	// 定义一个带参数带返回值的方法
	/**
	 * @param money 要支付的金额
	 * @return 返回相应的信息
	*/
	public static String payAndGet(double money) {
		if(money >= 10.0) {
			return "购买一份快餐，找零：" + (money - 10.0);
		} else {
			return "对不起，您的余额不足，请先充值，或者捡漏。";
		}
	}
	
	// 使用return结束方法返回
	public static void sale(int amount) {
		if(amount <= 0) {
			return;
		}
		System.out.println("销售出：" + amount + " 本图书");
	}
	
	// 方法重载
	// 方法重载是采用技术形式实现方法名称可重用的设计手段
	// 主要特点是：方法的名称可以相同，但是参数的类型或个数不同，在调用时会根据需要传递参数类型和个数，从而执行不同的方法体
	/**
	 * 实现2个整形数据的加法
	 * @param x 计算数字1
	 * @param y 计算数字2
	 * @return 加法的计算结果
	*/
	public static int sum(int x, int y) {
		return x + y;
	}
	
	/**
	 * 实现3个整形数据的加法
	 * @param x 计算数字1
	 * @param y 计算数字2
	 * @param z 计算数字3
	 * @return 加法的计算结果
	*/
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}

	/**
	 * 实现2个浮点数据的加法
	 * @param x 计算数字1
	 * @param y 计算数字2
	 * @return 加法的计算结果
	*/
	public static int sum(double x, double y) {
		return (int)(x + y);
	}	
	
	// 方法的递归调用
	// 递归调用时一种特殊的方法嵌套形式，可以利递归实现复杂的操作
	// 递归表示自己调用自己的形式，需要注意2点：1、必须有结束条件 2、每次调用根据需求改变传递参数的内容
	// 递归调用时迈向数据结构的第一步，但是如果想熟练掌握，需要大量代码的积累
	/**
	 * 实现 1~100数字的累加
	 * @param num 要进行累加的操作
	 * @return 数据的累加结果
	*/
	public static int sum(int num) {
		if(num == 1)
			return 1;
		return num + sum(num-1);
	}
	
	// 计算 1！+2！+3！+ ... +99!
	/**
	 * 实现数据的累加操作
	 * @param num 要处理数字
	 * @return 指定数字的阶乘结果
	*/
	public static double sumNum(int num) {
		if(num == 1) // 递归结束条件
			return factorial(1);
		
		return factorial(num) + sumNum(num -1); // 保存阶乘的结果
	}
	
	/**
	 * 实现数据的累加操作
	 * @param num 要处理数字
	 * @return 阶乘结果
	*/
	public static double factorial(int num) {
		if(num == 1) // 返回1*1的结果
			return 1;
		
		return num * factorial(num -1); // 递归调用
	}
}