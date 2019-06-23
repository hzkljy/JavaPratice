/*
	���� 
*/
public class ArrayDemo {
	public static void main(String [] args) {
		/*
			������ָһ����ر����ļ��ϡ�
			�����ǻ��������Դ洢�ṹ��������Ч��ʵ��һ�����������
			�����������������ͣ�����ƶ�ջ�ռ�ķ�������ô��ݵ����⡣
			
			����Ķ����﷨��
			
			�������������飺([]���Է��ڶ����������Ƶ�ǰ��Ҳ���Է��ڶ����������Ƶĺ���)
				�������� �������� [] = new �������� [����];
				�������� [] �������� = new �������� [����];
				
			�ֲ���ɣ�
				�������� �������� [] = null     ---> ��������
				�������� = new �������� [����]; ---> �������� 
				
			�����鿪�ٿռ����ô���Բ���"������[�±�|����]"����ʽ���з��ʣ�
			�������е��±궼�Ǵ�0��ʼ�ģ�������3�����ȵ����ݣ����±귶ΧΪ0~2
			
			JavaΪ�˷��������������ṩ��һ��"��������.length"���ԣ�����ֱ��ȡ������ĳ���
			
		*/
		
		// ��̬��ʼ����������
		int data [] = new int [3]; // ���鶯̬��ʼ��������Ϊ��Ĭ�ϵ�ֵ
		data [0] = 11; // Ϊ��������ֵ
		data [1] = 23;
		data [2] = 56;
		
		// ѭ�����
		for(int x = 0; x < data.length; x++) {
			System.out.print(data[x] + "��");
		}
		
		System.out.println();
		
		// ��̬��ʼ���������� �ڶ���ʱ�������˾����������� �������ȿ��ٺ�ֵ���ظ�����
		int data2[] = new int[] {22, 33, 55};
		
		// ѭ�����
		for(int x = 0; x < data2.length; x++) {
			System.out.print(data2[x] + "��");
		}
		
		
		System.out.println();
		
		// �������ô��ݷ���
		int temp[] = data2; // ���ô���
		temp[0] = 99;
		
		for(int x = 0; x < temp.length; x++) {
			System.out.print(temp[x] + "��");
		}
		
		System.out.println();
		
		// ���鱾�����������������ͣ�����ʹ��Ϊ���ٶ��ڴ�ռ������
		int data3[] = null; // ����һ������
		//System.out.println(data3[0]); // ������Exception in thread "main" java.lang.NullPointerException
		
		
		// foreach���
		// ����������ʽ��������ѭ���������ķ�����ʽ�⣬���ṩ��foreach�ṹ��foreach��for��һ�ּ���ʽ
		/*
			�﷨��ʽ��
				for(�������� ����:����|����) {
					// ѭ������룬ѭ������Ϊ����ĳ���
				}
		*/
		int data4[] = new int[] {1, 2, 3, 4, 7, 9}; // ���龲̬��ʼ��
		for(int tmp : data4) { // �Զ�ѭ������data4����ÿһ�����ݽ���tmp
			System.out.print(tmp + "��"); // ����ÿ��Ԫ�ػᱣ����tmp������
		}
		
		System.out.println();
		System.out.println();
		
		/*
			foreach�ô���
			��forѭ���ṹ��Ҳ���Ա��������±����ʱ���ڴ�������ɵ�����Խ�����
		*/
		
		/*
			��ά����
			�����﷨��
				��̬��ʼ������������ ��������[][] =  new ��������[�еĸ���][�еĸ���]
				��̬��ʼ������������ ��������[][] = new ��������[][] {{ֵ,ֵ,ֵ},{ֵ,ֵ,ֵ}}
		*/
		int data5[][] = new int[][] {{1,2,3,4,5},{1,2,3},{5,6,7,8}};
		
		for(int x=0; x<data5.length; x++) { // ������
			for(int y=0; y<data5[x].length; y++) { // �ڲ�ѭ��������
				System.out.println("data5["+x+"]["+y+"]"+data5[x][y]); // �������
			}
			System.out.println();
		}
		
		System.out.println();
		
		// ʹ��foreach�ṹ���
		for(int tmp[] : data5) { // ���ѭ������ÿһ������
			for(int num : tmp) { // �ڲ�ѭ����ȡ��������
				System.out.print(num + "��");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
			�����뷽��
		*/
		// ʹ�÷���������������
		int data6[] = new int[] {1, 2, 3}; // ��������
		printArray(data6); // �������ô���
		
		System.out.println();
		
		// ����һ������
		int data7[] = initArray(); // ���շ������ص�����
		for(int x : data7) {
			System.out.print(x + "��");
		}
		System.out.println();
		for(int x=0; x<data7.length; x++) {
			System.out.print(data7[x] + "��");
		}
		System.out.println();
		
		// ͨ�������޸���������
		int data8[] = new int[] {2, 4, 8, 16};
		changeArray(data8);
		for(int x : data8) {
			System.out.print(x + "��");
		}
		System.out.println();
		
		
	}
	
	/*
		����һ�������������ݽ������
	*/
	public static void printArray(int temp[]) {
		/*for(int x=0; x<temp.length; x++) {
			System.out.print(temp[x] + "��");
		}*/
		for(int x : temp) {
			System.out.print(x + "��");
		}
		System.out.println();
	}
	
	/*
		����һ����ʼ�����������
	*/
	public static int[] initArray() {
		int arr[] = new int[] {1,3,6}; // ��ʼ��һ������
		return arr; // ��������
	}
	
	/*
		�޸���������
	*/
	public static void changeArray(int arr[]) {
		for(int x=0; x<arr.length; x++) {
			arr[x] *= 2; // ����������*2
		}
	}
}