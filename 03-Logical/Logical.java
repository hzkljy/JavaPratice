public class Logical {
	public static void main(String[] args) {
		System.out.println("�����߼�����:");
		
		// Java�ĳ���ṹ��3��: ˳��ṹ ѡ��(��֧)�ṹ ѭ���ṹ
		
		// ��֧�ṹ Java�����ṩ������֧�ṹ: if��֧�ṹ��switch�������
		// if��֧�ṹ��Ҫ������߼�����Ĵ��������ж��Ƿ�ִ��ĳ�δ��룬��java��ʹ��if��else���ؼ�����ʵ�ִ˽ṹ��һ����3������
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
		
		// ʹ��if...���ṹ
		int age = 20;
		
		if(age >= 18 && age <= 22) {
			System.out.println("����һ����ѧ���!!!");
		}
		System.out.println("��ʼ�Ӵ��ڿƼ�");
		
		// �������2��ɱ�ֲ�����һ���Ƕϵ� ����һ����0 ���������� ����ڴ�ռ��
		
		// ʹ��if...else...���ṹ
		if(age > 18) {
			System.out.println("���ǳ�����");
		} else {
			System.out.println("�Ҳ��ǳ�����");
		}
		System.out.println("��ѽ");
		
		// ��������ж� if...else if...else if...else...
		double score = 90.0;
		if (score >=90 && score <= 100) {
			System.out.println("�ŵ���");
		} else if (score >=60 && score <90) {
			System.out.println("������");
		} else {
			System.out.println("�����");
		}
		
		// switch�������
		// switch�����һ��������� ����Ҫ�������ݽ����ж� ��Ҫע����� switch���ֻ���ж�����(int char ö�� String) �����ܽ��в������ʽ���ж�
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
		
		
		// ѭ���ṹ��ѭ���ṹ����Ҫ�ص��ǿ��Ը���ĳЩ�ж��������ظ�ִ��ĳ�γ������
		// Java��ѭ���ṹ��Ҫ��2�����ͣ�whileѭ���ṹ��forѭ���ṹ
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
		
		// forѭ����֪����ѭ��������ʱ��ʹ��
		/*
			forѭ���ڶ����ʱ��ѭ���ĳ�ʼ������ѭ���жϡ�ѭ���������������������һ��������棬
			����ִ�е�ʱ��ѭ������ֻ��ִ��һ�Σ�����ѭ���ж�������ÿ��ִ��ѭ����ǰ��������жϣ�
			����ÿ��ѭ����ִ����Ϻ󶼻��Զ�ִ��ѭ���������
		*/
		int sumValue = 0;
		for (int index = 1; index <= 100; index++) {
			sumValue += index;
		}
		System.out.println("sumValue: " + sumValue);
		
		// for��whileѭ��ʹ�õ�ʱ����ν���ѡ�������ȷ֪��ѭ��������ʱ��ʹ��for�������ȷ��ѭ������������֪����ֹ������ʱ��ʹ��whileѭ��
		sumValue = 1;
		int n = 1;
		while(sumValue <= 5050) {
			sumValue *= n;
			n++;
		}
		System.out.println("n: " + n);
		
		// ѭ���������
		// ѭ���ṹ���Ա�֤������ظ�ִ�� Ϊ�˱�֤������Զ�ѭ�����������жϿ��� �ṩ������ѭ��ֹͣ�Ŀ������
		// continue(�˳�����ѭ��)��break(�˳�����ѭ��)
		
		for(int x = 0; x < 10; x++) {
			if(x == 3)
				continue;
			
			System.out.print(x + "��");
		}
		
		System.out.println();
		
		for(int x = 0; x < 10; x++) {
			if(x == 3)
				break;
			
			System.out.print(x + "��");
		}
		System.out.println();
		
		// ѭ��Ƕ��
		// ѭ���ṹ����ͨ���﷨Ƕ����ʽʵ�ָ����ӵ��߼����Ʋ���
		// ��ӡ�˷��ھ�
		for(int x = 1; x <= 9; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + (x * y) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// ��ӡ������
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
		
		// li��������
		int li = 3;
		// x�����У�y����ÿ�д�ӡ��*����
		for(int x = 1; x <=li; x++) {
			for(int y = 1; y <= li - x; y++) {
				System.out.print(" ");
			}
			for(int y = 1; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// ����continue��ѭ��Ƕ�׵�ʹ������
		// �ڽ���ѭ��Ƕ�׵Ĵ����У�����ʹ��continue����ϳ�����ʵ����������
		point1: for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				if(x == y)
					continue point1;
				System.out.print(x + "��");
			}
			System.out.println();
		}
		
		
	}
}