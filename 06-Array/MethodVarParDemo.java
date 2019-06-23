/*
	�����ɱ����
*/
class ArrayUtil {
	// ��������������ۼ� ��һ���ɱ��������
	public static int sum(int ... data) {
		int sum = 0;
		for(int x : data) {
			sum += x;
		}
		return sum;
	}
	
	// ��ͨ�����Ϳɱ���� �ɱ����ֻ����һ�� �ұ��������� ��ͨ�������봫 �ɱ�������Ը�����Ҫ��
	public static int sum2(int i, int j, int ... data) {
		int sum = 0;
		
		for(int x=i; x<=j; x++) {
			sum += data[x];
		}
		
		return sum;
	}
}

public class MethodVarParDemo {
	public static void main(String args[]) {
		/*
			Ϊ�˷��㿪���߿��Ը������ض��巽�������ⷽ���в�����ִ�����ƣ�����Java�ṩ�˷����ɱ������֧��
			������һ�ص�����ڷ�������ʱ���ö�̬��ʽ�������ɲ������ݣ��ɱ���������﷨���£�
			public [static][final] ����ֵ���� ��������(�������� ... ����) { // ��Ȼ���巽ʽ���ˣ����Ǳ��ʻ���һ������
				[return [����ֵ];]
			}
		*/
		System.out.println(ArrayUtil.sum(1,2,3,4,5,6,7,8,9,10)); // �ɱ����
		
		System.out.println(ArrayUtil.sum(new int[] {11,22,33,44})); // ֱ�Ӵ�������
		
		/*
			ͨ������ĳ�����Կ������ɱ����ʵ���Ͼ��������һ�ֱ���Ӧ�ã�������������ص���ڷ����еĲ������վͿ��Խ�Ϊ���
		*/
		
		/*
			���ڻ�ϲ����Ķ���
			��Ҫע����ǣ�����˷�������Ҫ������ͨ�����Ϳɱ��������ɱ����һ��Ҫ������󣬲���һ������ֻ������һ���ɱ����
		*/
		// ����������i~j�ĺ�
		int data[] = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println(ArrayUtil.sum2(0,3, data));
	}
}