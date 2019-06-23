/*
	方法可变参数
*/
class ArrayUtil {
	// 计算给定参数的累加 是一个可变参数方法
	public static int sum(int ... data) {
		int sum = 0;
		for(int x : data) {
			sum += x;
		}
		return sum;
	}
	
	// 普通参数和可变参数 可变参数只能有一个 且必须放在最后 普通参数必须传 可变参数可以根据需要传
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
			为了方便开发者可以更加灵活地定义方法，避免方法中参数的执行限制，所以Java提供了方法可变参数的支持
			利用这一特点可以在方法调用时采用动态形式传递若干参数数据，可变参数定义语法如下：
			public [static][final] 返回值类型 方法名称(参数类型 ... 变量) { // 虽然定义方式变了，但是本质还是一个数组
				[return [返回值];]
			}
		*/
		System.out.println(ArrayUtil.sum(1,2,3,4,5,6,7,8,9,10)); // 可变参数
		
		System.out.println(ArrayUtil.sum(new int[] {11,22,33,44})); // 直接传递数组
		
		/*
			通过上面的程序可以看出：可变参数实际上就是数组的一种变相应用，但是利用这个特点对于方法中的参数接收就可以较为灵活
		*/
		
		/*
			关于混合参数的定义
			需要注意的是，如果此方法中需要接收普通参数和可变参数，则可变参数一定要放在最后，并且一个方法只允许定义一个可变参数
		*/
		// 计算数组中i~j的和
		int data[] = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println(ArrayUtil.sum2(0,3, data));
	}
}