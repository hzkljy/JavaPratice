public class IntValue {
	public static void main(String[] args) {
		System.out.println("IntValue class");
		
		// ���������ʱ��ͬʱ��������
		int cameraIndex = 1;
		
		System.out.println(cameraIndex);
		
		
		//��������һ����4������: byte short int long
		
		
		byte byteNumber = 100; // -128~+127
		System.out.println(byteNumber);
		
		int intNumber = 200; 
		System.out.println(intNumber * intNumber);
		
		// �۲��������
		int intMin = -2147483648;
		int intMax = 2147483647;
		
		System.out.println(intMin); // -2147483648
		System.out.println(intMax); // 2147483647
		System.out.println("");
		System.out.println(intMin - 1); // 2147483647
		System.out.println(intMax + 1); // -2147483648
		
		// ���������������ַ����� 1�����ø�����������ͣ���long��2��ʹ��ǿ������ת�� (long)���� �� ����L �� ����l
		System.out.println("����L ����l");
		System.out.println(intMin - 1L); // 2147483647
		System.out.println(intMax + 1l); // -2147483648
		
		System.out.println("(long)����");
		System.out.println((long)intMin - 1); // 2147483647
		System.out.println((long)intMax + 1); // -2147483648		
		
		// ������תС���ͱ���ʹ��ǿ������ת����ͬʱ��Ҫע���������
		// long����ǿ������ת��Ϊint����
		long longNum = 100000;
		int intNum = (int)longNum;
		
		System.out.println(intNum);
		
		// ��byte��Χ�ڿ����Զ�ת��int����
		byte byteNum = 100;
		System.out.println(byteNum);
		
		// ����byte��Χ����Ҫǿ��ת��
		byte byteNum2 = (byte)200;
		System.out.println(byteNum2);
		
		// JavaĬ�ϸ�������Ϊdouble����
		float floatX = (float) 102.2; // ǿ������ת�� doubleתΪfloat
		float floatY = 10.1F;         // ǿ������ת�� doubleתΪfloat
		
		System.out.println(floatX * floatY); // ������Ϊfloat����
		
		char charC = 'A';
		System.out.println(charC);
		
		int intNum2 = charC;
		System.out.println(intNum2);
		
		System.out.println((char)(intNum2 + 32));
		
		// char�����Ա�������
		char charZ = '��';
		System.out.println(charZ);
		
		System.out.println((int)charZ);
		
		// boolean���� true false �߼���ֵ
		boolean booleanFlag = true;
		if(booleanFlag) {
			System.out.println("is true");
			System.out.println(true);
			System.out.println(false);
			
			
		}
		
		// Java�в�����ʹ��0��1����䲼�����͵ı�������
		//if(1) { 
		//	
		//}
		
		// String �ַ��� ��һ��ϵͳ�࣬���Ǵ����ʹ�ý�Ϊ���⣬���Կ����������������һ��ʹ��
		String str = "Hello World";
		System.out.println(str);
		
		// +�����ַ����п�������������
		str = str + " 20190611";
		System.out.println(str);
		
		System.out.println(NumAdd(10, 20));
		
	}
	
	public static int NumAdd(int a, int b) {
		return a + b;
	}
}