public class MultipRule {
	public static void main(String[] args) {
		// 9*9�˷��ھ�
		// x�����к��ұߵ����� y�����к���ߵ����� ͬʱΪ�˷�ֹ����1*2������� ��֤y<=x
		// ��3*4=12 xΪ4 y=3 
		for(int x = 1; x <=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y + "*" + x + "=" + (y * x) + "\t");
			}
			System.out.println();
		}
	}
}