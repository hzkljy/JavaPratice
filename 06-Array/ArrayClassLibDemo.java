/*
	数组类库支持
*/
class ArrayUtil {
	
	// 打印数组
	public static void printArray(int arr[]) {
		for(int x : arr) {
			System.out.print(x + "、");
		}
		System.out.println();
	}
}

public class ArrayClassLibDemo {
	public static void main(String args[]) {
		/*
			为了方便开发者进行代码的编写，Java也提供了一些与数组有关的操作，考虑到学习层次
			本部分先为读者讲解两个数组常用的操作方法：数组排序、数组复制
			
			可以按照从小到大的顺序对基本数据类型的数组进行排序
			操作语法：
				java.util.Arrays.sort (数组名称)
				
			java util是一个Java系统包的名称，而Arrays是该包中的一个工具类
			
		*/
		int arr[] = new int[] {23, 12, 1, 234, 2, 6, 12, 34, 56};
		java.util.Arrays.sort(arr); // 调用 系统包进行排序
		ArrayUtil.printArray(arr);
		
		// 数组复制
		int dataA[] = new int[] {1,2,3,4,5,6,7,8,9};
		int dataB[] = new int[] {11,22,33,44,55,66,77,88,99};
		System.arraycopy(dataA, 5, dataB, 3, 3); // 复制dataA里面第5个元素开始的3个数据到dataB中第3个元素开始的位置
		ArrayUtil.printArray(dataB);
	}
}