public class Operator {
	public static void main(String[] args) {
		System.out.println("运算符:");
		
		// 使用 () 号改变优先级
		int result = 8 * (1 + 2);
		
		System.out.println(result);
		
		// % 取余运算
		System.out.println(73 % 10);
		
		// / 取整运算
		System.out.println(73 / 10);
		
		// 简化运算符 +=  *=  /=  %=
		int num = 10;
		num += 10;
		System.out.println(num);
		
		// 大写字母转小写字母
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('a');
		System.out.println((int)'a');
		
		System.out.println(BigToSmall('B'));
		System.out.println(SmallToBig('b'));
		
		// 自增 ++  自减 --
		int x = 10;
		int y = 10;
		
		result = ++x + y--; // 11 + 10
		System.out.println("result: " + result); // 21
		System.out.println("x: " + x); // 11
		System.out.println("y: " + y); // 9
		
		// 关系运算符 返回值是布尔类型
		x = 20;
		y = 10;
		boolean flag = x > y;
		if(flag)
			System.out.println("x > y");
		else
			System.out.println("x < y");
		
		System.out.println((int)'黄');
		
		char str = '黄';
		x = 40644;
		
		flag = str == x; // char可以自动转成int类型得到对应的编码值 然后再与x进行比较
		System.out.println(flag);
		
		// 三目运算符是一种简化的赋值运算符
		// 数据类型 变量 = 关系运算 ? 关系满足时的内容 : 关系不吗满足时的内容
		x = 20;
		y = 10;
		int max = x >= y ? x : y;
		System.out.println(max);
		
		System.out.println(x >=y ? "x >= y" : "x < y");
		
		// 逻辑运算符 当需要多个条件整体计算的时候 可以使用逻辑运算符进行连
		// 逻辑运算符一共有3种：与(多个条件一起满足) 或(多个条件有一个满足) 非(使用! 实现true和flase的转换)
		// &普通与(判断所有条件) &&短路与(一个false就返回false)
		//System.out.println(1 > 2 & 10 / 0 == 0); // 会报.ArithmeticException: / by zero异常
		System.out.println(1 > 2 && 10 / 0 == 0); // 1 > 2 为false 直接返回false 不会报错
		
		// 位运算符: 位运算符中提供了2中运算符: 逻辑运算符(~ & | ^) 移位运算符(>> << >>>) 其中>>>无符号右移
		// 10进制转2进制的原则为数据除2取余，最后倒着排
		// 如25，得到为11001，但是java里面int数据为32位 即 00000000 00000000 00000000 00011001
		
		x = 25;
		y = 6;
		
		System.out.println(x & y); // 0
		
		System.out.println(x | y); // 00011111 ---> 31
		
		x = 2;
		System.out.println("x左移3位后的结果: " + (x << 3)); // 16
		System.out.println("移位后x的值: " + x); // 2 原始内容不改变
	}
	
	// 大写字母转小写字母
	public static char BigToSmall(char c) {
		return (char)((int)c + 32);
	}
	
	// 小写字母转大写字母
	public static char SmallToBig(char c) {
		return (char)((int)c - 32);
	}
}