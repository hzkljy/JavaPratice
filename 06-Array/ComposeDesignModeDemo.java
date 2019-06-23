// 伪代码描述计算机

class 计算机 {
	private 显示器 对象数组[];
	private 主机 对象;
}

class 显示器 {}

class 主机 {
	private 主板 对象;
	private 鼠标 对象;
	private 键盘 对象;
}

class 主板 {
	private 内存 对象数组[];
	private CPU 对象数组[];
	private 显卡 对象;
	private 硬盘 对象数组[]
}

class 键盘 {}

class 鼠标 {}

class 内存 {}

class CPU {}

class 显卡 {}

class 硬盘 {}

public class ComposeDesignModeDemo {
	public static void main(String args[]) {
		/*
			合成设计模式
			面向对象设计的本质在于模块化设计，实际上读者可以发现，将一个完整的程序拆分为若干个子类型，
			通过引用关联就形成了合成设计。
			
			核心思想：通过不同的类实现子结构定义，随后将其在一个父类结构中整合。
			
			例如：要描述一个计算机组成类结构，内么在这样的状态下就必须先进行拆分
		*/
		
	
	}
}