class Message {
	public void printThis() {
		System.out.println("[Message��]this = " + this); // ��ʾ��ǰ����
	}
	
}
public class ThisObj {
	public static void main(String[] args) {
		System.out.println("This Obj");
		
		/*
			this ��ʾ��ǰ����
			
		*/
		
		Message msgA = new Message();
		System.out.println("[����]msgA = " + msgA); // ֱ���������
		msgA.printThis(); // ���÷������this
		System.out.println("-------------------------------");
		Message msgB = new Message();
		System.out.println("[����]msgB = " + msgB);
		msgB.printThis();
		
		/*
			�����
			This Obj
			[����]msgA = Message@548c4f57
			[Message��]this = Message@548c4f57
			-------------------------------
			[����]msgB = Message@1218025c
			[Message��]this = Message@1218025c
		*/
	}
}