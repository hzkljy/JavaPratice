/*
	�������֧��
*/
class ArrayUtil {
	
	// ��ӡ����
	public static void printArray(int arr[]) {
		for(int x : arr) {
			System.out.print(x + "��");
		}
		System.out.println();
	}
}

public class ArrayClassLibDemo {
	public static void main(String args[]) {
		/*
			Ϊ�˷��㿪���߽��д���ı�д��JavaҲ�ṩ��һЩ�������йصĲ��������ǵ�ѧϰ���
			��������Ϊ���߽����������鳣�õĲ��������������������鸴��
			
			���԰��մ�С�����˳��Ի����������͵������������
			�����﷨��
				java.util.Arrays.sort (��������)
				
			java util��һ��Javaϵͳ�������ƣ���Arrays�Ǹð��е�һ��������
			
		*/
		int arr[] = new int[] {23, 12, 1, 234, 2, 6, 12, 34, 56};
		java.util.Arrays.sort(arr); // ���� ϵͳ����������
		ArrayUtil.printArray(arr);
		
		// ���鸴��
		int dataA[] = new int[] {1,2,3,4,5,6,7,8,9};
		int dataB[] = new int[] {11,22,33,44,55,66,77,88,99};
		System.arraycopy(dataA, 5, dataB, 3, 3); // ����dataA�����5��Ԫ�ؿ�ʼ��3�����ݵ�dataB�е�3��Ԫ�ؿ�ʼ��λ��
		ArrayUtil.printArray(dataB);
	}
}