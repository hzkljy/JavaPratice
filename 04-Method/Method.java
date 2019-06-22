public class Method {
	public static void main(String[] args) {
		System.out.println("����");
		
		// ������һ�ִ�������ü�����ʵ�ֿ����ظ�ʹ��
		// ��һ����ĸСд�������ÿ����ĸ��һ����ĸ��Ҫ��д
		// public static ���εķ������Ա�������ֱ�ӵ���
		printInfo();
		printInfo();
		
		String result = payAndGet(99.9);
		System.out.println(result);
		System.out.println(payAndGet(9.9));
		
		sale(3);
		sale(-3);
		
		// ����������
		int resultA = sum(10, 20);
		int resultB = sum(10, 20, 30);
		int resultC = sum(10.2, 10.3);
		System.out.println(resultA);
		System.out.println(resultB);
		System.out.println(resultC);
		
		// �ݹ���ü���1~100�ĺ�
		int resultSum = sum(100);
		System.out.println(resultSum);
		
		// 1!+2!+3!+...+99!
		System.out.println(sumNum(99));
		
		// 1!+2!+3!+4��
		System.out.println(sumNum(4));
		
	}
	
	// Java���淽���Ĳ�������Ϊvoid�����ǿ���ʡ�Բ�д
	// ����һ���޲����޷���ֵ�ķ���
	public static void printInfo() {
		System.out.println("********************");
		System.out.println("*****printInfo******");
		System.out.println("********************");
	}
	
	// ����һ��������������ֵ�ķ���
	/**
	 * @param money Ҫ֧���Ľ��
	 * @return ������Ӧ����Ϣ
	*/
	public static String payAndGet(double money) {
		if(money >= 10.0) {
			return "����һ�ݿ�ͣ����㣺" + (money - 10.0);
		} else {
			return "�Բ����������㣬���ȳ�ֵ�����߼�©��";
		}
	}
	
	// ʹ��return������������
	public static void sale(int amount) {
		if(amount <= 0) {
			return;
		}
		System.out.println("���۳���" + amount + " ��ͼ��");
	}
	
	// ��������
	// ���������ǲ��ü�����ʽʵ�ַ������ƿ����õ�����ֶ�
	// ��Ҫ�ص��ǣ����������ƿ�����ͬ�����ǲ��������ͻ������ͬ���ڵ���ʱ�������Ҫ���ݲ������ͺ͸������Ӷ�ִ�в�ͬ�ķ�����
	/**
	 * ʵ��2���������ݵļӷ�
	 * @param x ��������1
	 * @param y ��������2
	 * @return �ӷ��ļ�����
	*/
	public static int sum(int x, int y) {
		return x + y;
	}
	
	/**
	 * ʵ��3���������ݵļӷ�
	 * @param x ��������1
	 * @param y ��������2
	 * @param z ��������3
	 * @return �ӷ��ļ�����
	*/
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}

	/**
	 * ʵ��2���������ݵļӷ�
	 * @param x ��������1
	 * @param y ��������2
	 * @return �ӷ��ļ�����
	*/
	public static int sum(double x, double y) {
		return (int)(x + y);
	}	
	
	// �����ĵݹ����
	// �ݹ����ʱһ������ķ���Ƕ����ʽ���������ݹ�ʵ�ָ��ӵĲ���
	// �ݹ��ʾ�Լ������Լ�����ʽ����Ҫע��2�㣺1�������н������� 2��ÿ�ε��ø�������ı䴫�ݲ���������
	// �ݹ����ʱ�������ݽṹ�ĵ�һ��������������������գ���Ҫ��������Ļ���
	/**
	 * ʵ�� 1~100���ֵ��ۼ�
	 * @param num Ҫ�����ۼӵĲ���
	 * @return ���ݵ��ۼӽ��
	*/
	public static int sum(int num) {
		if(num == 1)
			return 1;
		return num + sum(num-1);
	}
	
	// ���� 1��+2��+3��+ ... +99!
	/**
	 * ʵ�����ݵ��ۼӲ���
	 * @param num Ҫ��������
	 * @return ָ�����ֵĽ׳˽��
	*/
	public static double sumNum(int num) {
		if(num == 1) // �ݹ��������
			return factorial(1);
		
		return factorial(num) + sumNum(num -1); // ����׳˵Ľ��
	}
	
	/**
	 * ʵ�����ݵ��ۼӲ���
	 * @param num Ҫ��������
	 * @return �׳˽��
	*/
	public static double factorial(int num) {
		if(num == 1) // ����1*1�Ľ��
			return 1;
		
		return num * factorial(num -1); // �ݹ����
	}
}