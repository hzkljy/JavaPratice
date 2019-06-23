/*
	����һ��int���飬Ҫ����Լ�����������Ԫ�ص��ܺ͡����ֵ����Сֵ��ƽ��ֵ
*/

class ArrayUtil {
	private int sum; // �ܺ�
	private int max; // ���ֵ
	private int min; // ��Сֵ
	private double avg; // ƽ��ֵ
	
	public ArrayUtil() {}
	
	public ArrayUtil(int arr[]) {

	/*
		// �����ܺ�
		for(int x : arr) {
			this.sum += x;
		}
		
		// �������ֵ
		this.max = arr[0]; // �ȼ����0��ֵΪ���ֵ
		for(int x : arr) {
			if(x > this.max) { // ���xҪ�ȵ�ǰmaxֵ�󣬾͸���max��ֵ
				this.max = x;
			}
		}
		
		// ������Сֵ
		this.min = arr[0]; //�ȼ����0��ֵΪ��Сֵ
		for(int x : arr) {
			if(x < this.min) { // ���xҪ�ȵ�ǰminֵС���͸���min��ֵ
				this.min = x;
			}
		}
	*/	
	
		// ����Ĵ���Ч��̫�� ѭ����̫������� ��������Ż�
		this.max = arr[0];
		this.min = arr[0];
		
		// ѭ��һ�����齫�ܺ͡����ֵ����Сֵ�������
		for(int x : arr) {
			// sum
			this.sum += x;
			
			// max
			if(x > this.max)
				this.max = x;
			
			// min
			if(x < this.min)
				this.min = x;
		}
		
		// ����ƽ��ֵ
		this.avg = this.sum / arr.length;
	}
	
	// getter����
	public int getSum() {
		return this.sum;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public int getMin() {
		return this.min;
	}
	
	public double getAvg() {
		return this.avg;
	}
	
	public String getInfo() {
		return "�ܺͣ�" + this.sum + "�����ֵ��" + this.max + "����Сֵ��" + this.min + "��ƽ��ֵ��" + this.avg;
	}
}

public class ArrayCal {
	public static void main(String args[]) {
		int data[] = new int[] {1,2,3,4,5,6,7,8,9,10}; // ��ʼ��һ������
		ArrayUtil util = new ArrayUtil(data); // ʵ����һ������
		
		System.out.println(util.getInfo());
		
		/*
			����ʹ��������������ʽ������һ��ר�ŵ���������࣬�����ڴ���Ĺ��췽����
			ʵ�����������ݵ����ͳ�Ʋ����������棬�������������ʱ�Ͳ���ǣ��������ĳ����߼�
			ֻ��Ҫ������Ҫ�������ݻ�ȡ��Ӧ�Ľ������
			
			��ʾ���ں���ĳ�����ƣ�
			����ʵ����Ŀ�����У�����ͨ����Ϊ�ͻ��˵�����ʽ���֣�ִ�д���Ӧ��Խ��Խ�á�
			������ĳ���Ϊ�����ͻ���ֻ��Ҫ���벢��ȡ���������������������εõ��ģ�ʵ���Ͽͻ��˲������ġ�
		*/
	}
}