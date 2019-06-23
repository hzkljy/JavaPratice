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
		
		System.out.println();
		System.out.println();
		
		/*
			foreach好处：
			简化for循环结构，也可以避免数组下标访问时由于处理不当造成的数组越界访问
		*/
		
		/*
			二维数组
			定义语法：
				动态初始化：数据类型 数组名称[][] =  new 数据类型[行的个数][列的个数]
				静态初始化：数据类型 数组名称[][] = new 数据类型[][] {{值,值,值},{值,值,值}}
		*/
		int data5[][] = new int[][] {{1,2,3,4,5},{1,2,3},{5,6,7,8}};
		
		for(int x=0; x<data5.length; x++) { // 数组行
			for(int y=0; y<data5[x].length; y++) { // 内层循环控制列
				System.out.println("data5["+x+"]["+y+"]"+data5[x][y]); // 数组访问
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 使用foreach结构输出
		for(int tmp[] : data5) { // 外层循环返回每一行数组
			for(int num : tmp) { // 内层循环获取数组内容
				System.out.print(num + "、");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
			数组与方法
		*/
		// 使用方法接收数组引用
		int data6[] = new int[] {1, 2, 3}; // 定义数组
		printArray(data6); // 数组引用传递
		
		System.out.println();
		
		// 返回一个数组
		int data7[] = initArray(); // 接收方法返回的数组
		for(int x : data7) {
			System.out.print(x + "、");
		}
		System.out.println();
		for(int x=0; x<data7.length; x++) {
			System.out.print(data7[x] + "、");
		}
		System.out.println();
		
		// 通过方法修改数组内容
		int data8[] = new int[] {2, 4, 8, 16};
		changeArray(data8);
		for(int x : data8) {
			System.out.print(x + "、");
		}
		System.out.println();
		
		
	}
	
	/*
		接收一个整形数组内容进行输出
	*/
	public static void printArray(int temp[]) {
		/*for(int x=0; x<temp.length; x++) {
			System.out.print(temp[x] + "、");
		}*/
		for(int x : temp) {
			System.out.print(x + "、");
		}
		System.out.println();
	}
	
	/*
		返回一个初始化数组的内容
	*/
	public static int[] initArray() {
		int arr[] = new int[] {1,3,6}; // 初始化一个数组
		return arr; // 返回数组
	}
	
	/*
		修改数组内容
	*/
	public static void changeArray(int arr[]) {
		for(int x=0; x<arr.length; x++) {
			arr[x] *= 2; // 将数组内容*2
		}
	}
}