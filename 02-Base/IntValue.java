public class IntValue {
	public static void main(String[] args) {
		System.out.println("IntValue class");
		
		// 定义变量的时候，同时进行声明
		int cameraIndex = 1;
		
		System.out.println(cameraIndex);
		
		
		//整形数据一共有4种类型: byte short int long
		
		
		byte byteNumber = 100; // -128~+127
		System.out.println(byteNumber);
		
		int intNumber = 200; 
		System.out.println(intNumber * intNumber);
		
		// 观察数据溢出
		int intMin = -2147483648;
		int intMax = 2147483647;
		
		System.out.println(intMin); // -2147483648
		System.out.println(intMax); // 2147483647
		System.out.println("");
		System.out.println(intMin - 1); // 2147483647
		System.out.println(intMax + 1); // -2147483648
		
		// 解决数据溢出的类种方法： 1、换用更大的数据类型，如long，2、使用强制类型转换 (long)数字 或 数字L 或 数字l
		System.out.println("数字L 数字l");
		System.out.println(intMin - 1L); // 2147483647
		System.out.println(intMax + 1l); // -2147483648
		
		System.out.println("(long)数字");
		System.out.println((long)intMin - 1); // 2147483647
		System.out.println((long)intMax + 1); // -2147483648		
		
		// 大类型转小类型必须使用强制类型转换，同时需要注意溢出问题
		// long类型强制类型转换为int类型
		long longNum = 100000;
		int intNum = (int)longNum;
		
		System.out.println(intNum);
		
		// 在byte范围内可以自动转成int类型
		byte byteNum = 100;
		System.out.println(byteNum);
		
		// 不在byte范围内需要强制转换
		byte byteNum2 = (byte)200;
		System.out.println(byteNum2);
		
		// Java默认浮点类型为double类型
		float floatX = (float) 102.2; // 强制类型转换 double转为float
		float floatY = 10.1F;         // 强制类型转换 double转为float
		
		System.out.println(floatX * floatY); // 计算结果为float类型
		
		char charC = 'A';
		System.out.println(charC);
		
		int intNum2 = charC;
		System.out.println(intNum2);
		
		System.out.println((char)(intNum2 + 32));
		
		// char还可以保存中文
		char charZ = '黄';
		System.out.println(charZ);
		
		System.out.println((int)charZ);
		
		// boolean类型 true false 逻辑数值
		boolean booleanFlag = true;
		if(booleanFlag) {
			System.out.println("is true");
			System.out.println(true);
			System.out.println(false);
			
			
		}
		
		// Java中不允许使用0或1来填充布尔类型的变量内容
		//if(1) { 
		//	
		//}
		
		// String 字符串 是一个系统类，但是此类的使用较为特殊，所以可以像基本数据类型一样使用
		String str = "Hello World";
		System.out.println(str);
		
		// +号在字符串中可以用于连作用
		str = str + " 20190611";
		System.out.println(str);
		
		System.out.println(NumAdd(10, 20));
		
	}
	
	public static int NumAdd(int a, int b) {
		return a + b;
	}
}