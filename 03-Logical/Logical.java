public class Logical {
	public static void main(String[] args) {
		System.out.println("程序逻辑控制:");
		
		// Java的程序结构有3种: 顺序结构 选择(分支)结构 循环结构
		
		// 分支结构 Java里面提供了两分支结构: if分支结构和switch开关语句
		// if分支结构主要是针对逻辑运算的处理结果来判断是否执行某段代码，在java中使用if与else两关键字来实现此结构，一共有3种类型
		boolean flag = true;
		
		// if
		if(flag) {
			System.out.println("if");
		}
		
		// if else
		if(flag) {
			System.out.println("if else");
		} else {
			System.out.println("if else");
		}
		
		// if else if 
		if(flag) {
			System.out.println("if else if");
		} else if (flag) {
			System.out.println("if else if");
		} else {
			System.out.println("if else if");
		}
		
		// 使用if...语句结构
		int age = 20;
		
		if(age >= 18 && age <= 22) {
			System.out.println("我是一个大学生喔!!!");
		}
		System.out.println("开始接触黑科技");
		
		// 计算机的2个杀手操作：一个是断电 另外一个除0 结果是无穷大 会把内存占满
		
		// 使用if...else...语句结构
		if(age > 18) {
			System.out.println("我是成年人");
		} else {
			System.out.println("我不是成年人");
		}
		System.out.println("你呀");
		
		// 多个条件判断 if...else if...else if...else...
		double score = 90.0;
		if (score >=90 && score <= 100) {
			System.out.println("优等生");
		} else if (score >=60 && score <90) {
			System.out.println("良好生");
		} else {
			System.out.println("差等生");
		}
		
		// switch开关语句
		// switch语句是一个开关语句 他主要根据内容进行判断 需要注意的是 switch语句只能判断数据(int char 枚举 String) 而不能进行布尔表达式的判断
		age = 10;
		
		switch(age) {
			case 5: {
				System.out.println("5");
				break;
			}
			case 10: {
				System.out.println("10");
				break;
			}
			case 25: {
				System.out.println("25");
				break;
			}
			default : {
				System.out.println("default");
				break;
			}
			
		}
		
		
		// 循环结构：循环结构的主要特点是可以根据某些判断条件来重复执行某段程序代码
		// Java中循环结构主要有2种类型：while循环结构和for循环结构
		int num = 1;
		int sum = 0;
		while(num <= 100) {
			sum += num;
			num++;
		}
		System.out.println("1+2+3+...+100=" + sum);
		
		num = 1;
		sum = 0;
		do {
			sum += num;
			num++;
		} while(num <=100);
		System.out.println("1+2+3+...+100=" + sum);
		
		// for循环在知道了循环次数的时候使用
		/*
			for循环在定义的时候将循环的初始条件、循环判断、循环条件变更操作都放在了一条语句里面，
			而在执行的时候循环条件只会执行一次，而后循环判断条件在每次执行循环体前都会进行判断，
			并且每当循环体执行完毕后都会自动执行循环条件变更
		*/
		int sumValue = 0;
		for (int index = 1; index <= 100; index++) {
			sumValue += index;
		}
		System.out.println("sumValue: " + sumValue);
		
		// for和while循环使用的时候如何进行选择，如果明确知道循环次数的时候使用for，如果不确定循环次数，但是知道终止条件的时候，使用while循环
		sumValue = 1;
		int n = 1;
		while(sumValue <= 5050) {
			sumValue *= n;
			n++;
		}
		System.out.println("n: " + n);
		
		// 循环控制语句
		// 循环结构可以保证代码的重复执行 为了保证程序可以对循环操作进行中断控制 提供了两个循环停止的控制语句
		// continue(退出本次循环)、break(退出整个循环)
		
		for(int x = 0; x < 10; x++) {
			if(x == 3)
				continue;
			
			System.out.print(x + "、");
		}
		
		System.out.println();
		
		for(int x = 0; x < 10; x++) {
			if(x == 3)
				break;
			
			System.out.print(x + "、");
		}
		System.out.println();
		
		// 循环嵌套
		// 循环结构可以通过语法嵌套形式实现更复杂的逻辑控制操作
		// 打印乘法口诀
		for(int x = 1; x <= 9; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + (x * y) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// 打印金字塔
		int line = 5;
		for(int x = 0; x < line; x++) {
			for(int y = 0; y < line - x; y++) {
				System.out.print(" ");
			}
			for(int y = 0; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// li控制行数
		int li = 3;
		// x控制行，y控制每行打印的*个数
		for(int x = 1; x <=li; x++) {
			for(int y = 1; y <= li - x; y++) {
				System.out.print(" ");
			}
			for(int y = 1; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 关于continue与循环嵌套的使用问题
		// 在进行循环嵌套的代码中，可以使用continue并结合程序标记实现跳出处理
		point1: for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				if(x == y)
					continue point1;
				System.out.print(x + "、");
			}
			System.out.println();
		}
		
		
	}
}