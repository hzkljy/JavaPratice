// ʵ�������������
class ArraySort {
	
	// sortʵ������ 
	public static void sort(int data[]) {
		for(int x=0; x<data.length; x++) {
			for(int y=0; y<data.length -x -1; y++) {
				if(data[y] > data[y+1]) { // ��ǰ���ݴ��ں������� �������ݽ���
					int temp = data[y];
					data[y] = data[y+1];
					data[y+1] = temp;
				}
			}
		}
	}
	
	// reverseʵ��ת��
	// ȡ�����һ����Ϊѭ��������������β����
	// ʹ��ǰ����������ʵ�����ݵĽ���Ŀ��
	public static void reverse(int data[]) {
		int center = data.length / 2; // ȷ����������
		int head = 0; // ǰ����
		int tail = data.length - 1; // ������
		
		for(int x=0; x<center; x++) { // ѭ��ת�� �������ݽ���
			int temp = data[head];
			data[head] =  data[tail];
			data[tail] = temp;
			head++;
			tail--;
		}
	}
	
	// reverseʵ�ֶ�ά�����ת��
	// ���������ݵ�ת��
	public static void reverse(int data[][]) {
		for(int x=0; x<data.length; x++) {
			for(int y=x; y<data[x].length; y++) { // ʵ�����н���
				int temp = data[x][y];
				data[x][y] = data[y][x];
				data[y][x] = temp;
			}
		}
		System.out.println();
	}
	
	// ��ӡ��������
	public static void printArray(int temp[]) {
		for(int x=0; x<temp.length; x++) {
			System.out.print(temp[x] + "��");
		}
		System.out.println();
	}
	
	public static void printArray(int temp[][]) {
		for(int x=0; x<temp.length; x++) {
			for(int y=0; y<temp[x].length; y++) {
				System.out.print(temp[x][y] + "��");
			}
			System.out.println();
		}
	}
}

public class ArrayCaseDemo {
	public static void main(String args[]) {
		/*
			���鰸������
			1����������
			2������ת��
		*/
		
		// 1����������
		int data[] = new int[] {8,9,0,2,3,5,10,7,6,1}; // ����ԭʼ����
		ArraySort.sort(data); // ����
		ArraySort.printArray(data); // �������
		
		// 2������ת��
		/*
			ת�ã���������β��������ݽ��н���
		*/
		// ������õ��������ת��
		ArraySort.reverse(data);
		ArraySort.printArray(data);
		
		// ��ά�����ת��
		int data2[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		ArraySort.printArray(data2);
		ArraySort.reverse(data2);
		ArraySort.printArray(data2);
		
	}
}