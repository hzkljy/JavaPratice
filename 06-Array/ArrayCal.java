/*
	定义一个int数组，要求可以计算出这个数组元素的总和、最大值、最小值、平均值
*/

class ArrayUtil {
	private int sum; // 总和
	private int max; // 最大值
	private int min; // 最小值
	private double avg; // 平均值
	
	public ArrayUtil() {}
	
	public ArrayUtil(int arr[]) {

	/*
		// 计算总和
		for(int x : arr) {
			this.sum += x;
		}
		
		// 计算最大值
		this.max = arr[0]; // 先假设第0个值为最大值
		for(int x : arr) {
			if(x > this.max) { // 如果x要比当前max值大，就更新max的值
				this.max = x;
			}
		}
		
		// 计算最小值
		this.min = arr[0]; //先假设第0个值为最小值
		for(int x : arr) {
			if(x < this.min) { // 如果x要比当前min值小，就更新min的值
				this.min = x;
			}
		}
	*/	
	
		// 上面的代码效率太低 循环了太多次数组 下面进行优化
		this.max = arr[0];
		this.min = arr[0];
		
		// 循环一次数组将总和、最大值、最小值都求出来
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
		
		// 计算平均值
		this.avg = this.sum / arr.length;
	}
	
	// getter方法
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
		return "总和：" + this.sum + "、最大值：" + this.max + "、最小值：" + this.min + "、平均值：" + this.avg;
	}
}

public class ArrayCal {
	public static void main(String args[]) {
		int data[] = new int[] {1,2,3,4,5,6,7,8,9,10}; // 初始化一个数组
		ArrayUtil util = new ArrayUtil(data); // 实例化一个计算
		
		System.out.println(util.getInfo());
		
		/*
			本例使用了面向对象的形式定义了一个专门的数组操作类，并且在此类的构造方法中
			实现了数组内容的相关统计操作与结果保存，这样在主类调用时就不再牵扯到具体的程序逻辑
			只需要根据需要传入数据获取相应的结果即可
			
			提示关于合理的程序设计：
			在现实的项目开发中，主类通常作为客户端调用形式出现，执行代码应该越简单越好。
			以上面的程序为例，客户端只需要传入并获取结果，而对于这个结果是如何得到的，实际上客户端并不关心。
		*/
	}
}