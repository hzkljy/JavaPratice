/*
	��������ڳ���֮��ʹ�� {} ����������һ�γ��򣬶����ݴ����������λ���Լ������ؼ��ֵĲ�ͬ��������Ϊ4�֣�
	��ͨ����顢�������顢��̬����顢ͬ�������(ͬ�������14�½�)
	��ͨ����飺�����ڷ����еĴ���飬���ô���������Խ���������һ�������й������³����ظ��������������
	�������飺������鶨����һ������
	��̬����飺Ҳ�Ƕ��������еģ����һ������������ʹ����static�ؼ��ֽ��ж���Ļ�����ô�ͱ�ʾ��̬�����
*/
class Message {
	public static String getCountry() {
		return "www.baidu.com";
	}
}

class Person {
	private static String country;
	static {
		country = Message.getCountry();
		System.out.println(country);
	}
	
	//public Person() {
	//	System.out.println("[���췽��]Person�๹�췽��ִ��");
	//}
	//// �������� 
	//{
	//	System.out.println("[�����]Person�๹���ִ��");
	//}
	//// ��̬�����
	//static {
	//	System.out.println("[��̬��]��̬��ִ��");
	//}
}



public class CodeBlock {
	

		
	public static void main(String[] args) {
		//if(true) {
		//	int x = 10;
		//	System.out.println("x = " + x);
		//}
		//int x = 100;
		//System.out.println("x = " + x);
		//
		//// ��ͨ�����
		//{
		//	int y = 1;
		//	System.out.println("y = " + y);
		//}
		//int y = 100;
		//System.out.println("y = " + y);
		//
		//new Person();
		//new Person();
		/*
		[�����]Person�๹���ִ��
		[���췽��]Person�๹�췽��ִ��
		[�����]Person�๹���ִ��
		[���췽��]Person�๹�췽��ִ��
		���ۣ�ÿһ��ʵ���µĶ��󶼻�ִ�У��������ڹ��췽��֮ǰִ��
		*/
		
		//��̬�� 
		/*
		[��̬��]��̬��ִ��
		[�����]Person�๹���ִ��
		[���췽��]Person�๹�췽��ִ��
		[�����]Person�๹���ִ��
		[���췽��]Person�๹�췽��ִ��
		���ۣ���̬������ȼ����ڹ�������
		*/
		
		// ���þ�̬��������ʵ��һЩ���ش���ĳ�ʼ������
		new Person();
		

		
	}
	
	// �������ж��徲̬����
	static {
		System.out.println("***************�ڵ�����******************");
	}
		
}