/*
	数组 
*/
public class ArrayDemo {
	public static void main(String [] args) {
		/*
			数组是指一组相关变量的集合。
			数组是基础的线性存储结构，可以有效的实现一组变量关联。
			数组是引用数据类型，会设计堆栈空间的分配和引用传递的问题。
			
			数组的定义语法：
			
			声明并开辟数组：([]可以放在定义数组名称的前面也可以放在定义数组名称的后面)
				数据类型 数组名称 [] = new 数据类型 [长度];
				数据类型 [] 数组名称 = new 数据类型 [长度];
				
			分步完成：
				数据类型 数组名称 [] = null     ---> 声明数组
				数组名称 = new 数据类型 [长度]; ---> 开辟数组 
				
			当数组开辟空间后，那么可以采用"数组名[下标|索引]"的形式进行访问，
			但是所有的下标都是从0开始的，即如是3个长度的数据，则下标范围为0~2
			
			Java为了方便数组的输出，提供了一个"数组名称.length"属性，可以直接取得数组的长度
			
		*/
		
		// 动态初始化定义数组
		int data [] = new int [3]; // 数组动态初始化，内容为其默认的值
		data [0] = 11; // 为数组设置值
		data [1] = 23;
		data [2] = 56;
		
		// 循环输出
		for(int x = 0; x < data.length; x++) {
			System.out.print(data[x] + "、");
		}
		
		System.out.println();
		
		// 静态初始化定义数组 在定义时就设置了具体数据内容 避免了先开辟后赋值的重复操作
		int data2[] = new int[] {22, 33, 55};
		
		// 循环输出
		for(int x = 0; x < data2.length; x++) {
			System.out.print(data2[x] + "、");
		}
		
		
		System.out.println();
		
		// 数组引用传递分析
		int temp[] = data2; // 引用传递
		temp[0] = 99;
		
		for(int x = 0; x < temp.length; x++) {
			System.out.print(temp[x] + "、");
		}
		
		System.out.println();
		
		// 数组本身属于引用数据类型，不能使用为开辟堆内存空间的数组
		int data3[] = null; // 声明一个数组
		//System.out.println(data3[0]); // 报错：、Exception in thread "main" java.lang.NullPointerException
		
		
		// foreach输出
		// 数组的输出形式除了依据循环与索引的访问形式外，还提供了foreach结构，foreach是for的一种简化形式
		/*
			语法格式：
				for(数据类型 变量:数组|集合) {
					// 循环体代码，循环次数为数组的长度
				}
		*/
		int data4[] = new int[] {1, 2, 3, 4, 7, 9}; // 数组静态初始化
		for(int tmp : data4) { // 自动循环，将data4数组每一个内容交给tmp
			System.out.print(tmp + "、"); // 数组每个元素会保存在tmp变量中
		}
		
		/*
			foreach好处：
			简化for循环结构，也可以避免数组下标访问时由于处理不当造成的数组越界访问
		*/
		
	}
}