public class Operator {
	public static void main(String[] args) {
		System.out.println("�����:");
		
		// ʹ�� () �Ÿı����ȼ�
		int result = 8 * (1 + 2);
		
		System.out.println(result);
		
		// % ȡ������
		System.out.println(73 % 10);
		
		// / ȡ������
		System.out.println(73 / 10);
		
		// ������� +=  *=  /=  %=
		int num = 10;
		num += 10;
		System.out.println(num);
		
		// ��д��ĸתСд��ĸ
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('a');
		System.out.println((int)'a');
		
		System.out.println(BigToSmall('B'));
		System.out.println(SmallToBig('b'));
		
		// ���� ++  �Լ� --
		int x = 10;
		int y = 10;
		
		result = ++x + y--; // 11 + 10
		System.out.println("result: " + result); // 21
		System.out.println("x: " + x); // 11
		System.out.println("y: " + y); // 9
		
		// ��ϵ����� ����ֵ�ǲ�������
		x = 20;
		y = 10;
		boolean flag = x > y;
		if(flag)
			System.out.println("x > y");
		else
			System.out.println("x < y");
		
		System.out.println((int)'��');
		
		char str = '��';
		x = 40644;
		
		flag = str == x; // char�����Զ�ת��int���͵õ���Ӧ�ı���ֵ Ȼ������x���бȽ�
		System.out.println(flag);
		
		// ��Ŀ�������һ�ּ򻯵ĸ�ֵ�����
		// �������� ���� = ��ϵ���� ? ��ϵ����ʱ������ : ��ϵ��������ʱ������
		x = 20;
		y = 10;
		int max = x >= y ? x : y;
		System.out.println(max);
		
		System.out.println(x >=y ? "x >= y" : "x < y");
		
		// �߼������ ����Ҫ���������������ʱ�� ����ʹ���߼������������
		// �߼������һ����3�֣���(�������һ������) ��(���������һ������) ��(ʹ��! ʵ��true��flase��ת��)
		// &��ͨ��(�ж���������) &&��·��(һ��false�ͷ���false)
		//System.out.println(1 > 2 & 10 / 0 == 0); // �ᱨ.ArithmeticException: / by zero�쳣
		System.out.println(1 > 2 && 10 / 0 == 0); // 1 > 2 Ϊfalse ֱ�ӷ���false ���ᱨ��
		
		// λ�����: λ��������ṩ��2�������: �߼������(~ & | ^) ��λ�����(>> << >>>) ����>>>�޷�������
		// 10����ת2���Ƶ�ԭ��Ϊ���ݳ�2ȡ�࣬�������
		// ��25���õ�Ϊ11001������java����int����Ϊ32λ �� 00000000 00000000 00000000 00011001
		
		x = 25;
		y = 6;
		
		System.out.println(x & y); // 0
		
		System.out.println(x | y); // 00011111 ---> 31
		
		x = 2;
		System.out.println("x����3λ��Ľ��: " + (x << 3)); // 16
		System.out.println("��λ��x��ֵ: " + x); // 2 ԭʼ���ݲ��ı�
	}
	
	// ��д��ĸתСд��ĸ
	public static char BigToSmall(char c) {
		return (char)((int)c + 32);
	}
	
	// Сд��ĸת��д��ĸ
	public static char SmallToBig(char c) {
		return (char)((int)c - 32);
	}
}