// 实现数组排序的类
class ArraySort {
	
	// sort实现排序 
	public static void sort(int data[]) {
		for(int x=0; x<data.length; x++) {
			for(int y=0; y<data.length -x -1; y++) {
				if(data[y] > data[y+1]) { // 当前内容大于后续内容 进行数据交换
					int temp = data[y];
					data[y] = data[y+1];
					data[y+1] = temp;
				}
			}
		}
	}
	
	// reverse实现转置
	// 取数组的一半作为循环次数，进行首尾交换
	// 使用前后两的索引实现数据的交换目的
	public static void reverse(int data[]) {
		int center = data.length / 2; // 确定交换次数
		int head = 0; // 前索引
		int tail = data.length - 1; // 后索引
		
		for(int x=0; x<center; x++) { // 循环转置 进行数据交换
			int temp = data[head];
			data[head] =  data[tail];
			data[tail] = temp;
			head++;
			tail--;
		}
	}
	
	// reverse实现二维数组的转置
	// 行行列内容的转置
	public static void reverse(int data[][]) {
		for(int x=0; x<data.length; x++) {
			for(int y=x; y<data[x].length; y++) { // 实现行列交换
				int temp = data[x][y];
				data[x][y] = data[y][x];
				data[y][x] = temp;
			}
		}
		System.out.println();
	}
	
	// 打印数组内容
	public static void printArray(int temp[]) {
		for(int x=0; x<temp.length; x++) {
			System.out.print(temp[x] + "、");
		}
		System.out.println();
	}
	
	public static void printArray(int temp[][]) {
		for(int x=0; x<temp.length; x++) {
			for(int y=0; y<temp[x].length; y++) {
				System.out.print(temp[x][y] + "、");
			}
			System.out.println();
		}
	}
}

public class ArrayCaseDemo {
	public static void main(String args[]) {
		/*
			数组案例分析
			1、数组排序
			2、数组转置
		*/
		
		// 1、数组排序
		int data[] = new int[] {8,9,0,2,3,5,10,7,6,1}; // 排序原始数列
		ArraySort.sort(data); // 排序
		ArraySort.printArray(data); // 数组输出
		
		// 2、数组转置
		/*
			转置：将数组首尾保存的数据进行交换
		*/
		// 将排序好的数组进行转置
		ArraySort.reverse(data);
		ArraySort.printArray(data);
		
		// 二维数组的转置
		int data2[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		ArraySort.printArray(data2);
		ArraySort.reverse(data2);
		ArraySort.printArray(data2);
		
	}
}