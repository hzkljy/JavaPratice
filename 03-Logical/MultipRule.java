public class MultipRule {
	public static void main(String[] args) {
		// 9*9乘法口诀
		// x控制行和右边的数据 y控制列和左边的数据 同时为了防止出现1*2这种情况 保证y<=x
		// 如3*4=12 x为4 y=3 
		for(int x = 1; x <=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y + "*" + x + "=" + (y * x) + "\t");
			}
			System.out.println();
		}
	}
}