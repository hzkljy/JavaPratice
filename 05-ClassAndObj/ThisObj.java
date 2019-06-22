class Message {
	public void printThis() {
		System.out.println("[Message类]this = " + this); // 表示当前对象
	}
	
}
public class ThisObj {
	public static void main(String[] args) {
		System.out.println("This Obj");
		
		/*
			this 表示当前对象
			
		*/
		
		Message msgA = new Message();
		System.out.println("[主类]msgA = " + msgA); // 直接输出对象
		msgA.printThis(); // 调用方法输出this
		System.out.println("-------------------------------");
		Message msgB = new Message();
		System.out.println("[主类]msgB = " + msgB);
		msgB.printThis();
		
		/*
			结果：
			This Obj
			[主类]msgA = Message@548c4f57
			[Message类]this = Message@548c4f57
			-------------------------------
			[主类]msgB = Message@1218025c
			[Message类]this = Message@1218025c
		*/
	}
}