# JAVA SE

## 



## 01 进制及数值数据的编码

使用命令行的方式执行的时候，cmd的默认编码格式是GBK
因此在输入中文的时候需要设置文件的编码格式位ANSI，不会出现乱码错误

注意：
	1、java文件的名称必须跟public class的名称保持一致
	2、一个java文件中可以包含多个class,凡是public class只能有1个
	3、public static void main(String[] args)是所有java程序的入口，
		如果想执行对应的java代码，则必须要添加如下方法，且格式是固定的
	4、main方法中参数列表可以支持多种写法：String[] args,String [] args,String args[]
	5、main方法中参数的名称无所谓，但是一般写成args
	6、java代码在编写的时候，每行结尾的时候需要使用;结束
	7、java代码的代码块需要使用{}括起来，前后匹配
*/
/*java中的注释分为三类*/
//	1、单行注释：*

/*	2、多行注释:

*/

/**	
*3、文档注释：
*/



## 02 初识Java


	

	常量和变量
		常量：在程序运行过程中，值不会发生改变的量叫做常量
		变量：在程序运行过程中，值会发生改变的量叫做变量
		
		变量：变量名称，变量类型，作用域
			1、先声明，后赋值
				int a;声明
				a =10;赋值
			2、声明+赋值
		常量：
			使用final关键字修饰的变量称之为常量或者叫做最终常量，表示不可修改
		注意：
			在类内，方法外定义的变量叫成员变量,会存在默认值
			在方法内，定义的变量必须要进行初始化操作，不会存在默认值
			在一行中可以定义多个变量，但是不推荐，每个变量最好单独一行
			给变量赋值过程中，变量的值成为常量

```
标识符命名规范
	硬性规定：
		1、标识符必须以字母，下划线或者美元符号开头
		2、其他部分必须是字母，数字，下划线或者美元符号，但是不能出现特殊符号
		3、标识符大小写敏感
		4、不能是java的关键字或者保留字（留给系统使用的表示特殊含义的字符串）
	常规建议：
		1、驼峰标识
			1、类名，接口名称在命名的时候要首字符大写
			2、方法，变量命名的时候首字符要小写
			3、多个单词拼接表示一个标识符的时候，每个单词的首字符都大写
		2、见名知义
			通过标识符的名称能知道代表的含义
			千万不要写拼音
```



## 03 数据类型和运算符

### 数据类型
​	Java是一种**强类型**的语言
​		强类型表示，变量在定义的时候必须显式的声明类型是什么		java
​		弱类型表示，变量会根据值自己去推断，不需要指定类型是什么	js,python,scala
​	Java数据类型
​		**基本数据类型（4类8种）**
​			**整数类型**：byte short int long(不同类型表示不同的长度)
​				byte: 	使用一个字节存储，因此范围是	-128-127
​				short:	使用两个字节存储，因此范围是 -32768-32767
​				int:	使用四个字节存储，因此范围是 正负21亿
​				long：	使用八个字节存储，因此范围是。。。。。。
​				注意：
​					1、在使用整型类型的时候，默认都是int类型，
​					2、如果需要使用long类型的话，必须要在数字的后面添加L,建议使用大写，小写容易跟1混淆。
​			**浮点类型**: float double   小数类型：使用小数点	使用科学计数法
​				float:	单精度，精度可以精确到小数点后7位
​				double:	双精度，精度是float的双倍
​				注意：
​					1、默认浮点类型是double类型
​					2、使用float的时候，数字后要添加f
​					3、浮点类型并不能表示一个精确的值，会损失一定的精度
​			**字符类型**: char
​				占用2个字节，使用的时候使用''表示
​			**布尔类型**: boolean
​				只有true和false两值，在存储的时候占1位
​		**引用数据类型**:
​			类
​			接口
​			数组


	运算符：
		算术运算符:  +，-，*，/，%，++，--;
			
		赋值运算符 =  
			java中=表示赋值运算符，==表示相等的操作
		扩展赋值运算符:+=，-=，*=，/= 
			
		关系运算符:  >，<，>=，<=，==，!=
			用来比较两值的关系，
		逻辑运算符:  &&，||，!
			逻辑运算符一般两边的值不是具体的值，而是表达式
		位运算符:  &，|，^，~ ， >>，<<，>>> (了解！！！)
		条件运算符 ？： 


## 04 流程控制语句

### 分支结构：
​	单分支结构：
​		只做单一条件的判断，如果符合，做某些事情
​	双分支结构：
​		当做条件判断的时候，只有两种选择
​	多分支结构：
​		可以进行多个条件的判断，每个匹配项可以选择不同的执行结果
​	嵌套分支结构：
​		在分支结构中嵌套分支结构
​	switch多分支结构：
​		一般用作等值判断

```java
public class IfDemo{
	
	public static void main(String[] args){
		
		//单分支判断,Math.random()产生数据的范围是[0,1)
		//得到0-5之间的随机数
		//int i = (int)(Math.random()*6);
		//if(i>3){
		//	System.out.println("值大于3");
		//}
		//System.out.println("number:"+i);
		
		/*
		double i = 6 * Math.random();
		double j = 6 * Math.random();
		double k = 6 * Math.random();
		int count = (int) (i + j + k);
		if(count > 15) {
			System.out.println("今天手气不错");
		}
		if(count >= 10 && count <= 15) {   //错误写法：10<count<15
			System.out.println("今天手气很一般");
		}
		if(count < 10) {
			System.out.println("今天手气不怎么样");
		}
		System.out.println("得了" + count + "分");*/
		
		
		//双分支结构
		/*
		int r = 1;
		double PI = 3.14;
		double area = PI * r * r;
		double length = 2 * PI * r;
		if(area >= length){
			System.out.println("面积大于等于周长");
		}else{
			System.out.println("周长大于面积");
		}
		*/
		//Scanner
		//创建文件扫描器对象，System.in表示的是标准输入，可以从控制台读取数据(装饰者模式)
		//注意:每次读取回来的值都是字符串类型，需要进行类型转换
		//Scanner sc = new Scanner(System.in);
		//System.out.println("请输入数据");
		//String str = sc.nextLine();
		//System.out.println(str);
		
		
		//多分支结构
		/*
		int age = (int)(Math.random()*100);
		if(age<10){
			System.out.println("儿童");
		}else if(age<20){
			System.out.println("少年");
		}else if(age<30){
			System.out.println("青年");
		}else if(age<50){
			System.out.println("中年");
		}else if(age<70){
			System.out.println("老年");
		}else{
			System.out.println("耄耋");
		}
		*/
		
		//嵌套分支结构
		/*
		int time = (int)(Math.random()*40);
		if(time<20){
			System.out.println("恭喜进入决赛");
			String sex = ((int)(Math.random()*2))==0?"girl":"boy";
			if(sex=="girl"){
				System.out.println("欢迎进入女子组");
			}else{
				System.out.println("欢迎进入男子组");
			}
		}else{
			System.out.println("成绩太差，被淘汰");
		}
		*/
		
		//switch多分支结构
		/*注意：
			1、每个case模块中要添加break，防止多次匹配
			2、如果多个case中处理的逻辑代码块的功能一致，可以考虑只在最后添加一次处理
			3、default表示默认选项，当所有的case不匹配的时候，会执行此选项
			4、defult可以有，也可以没有
		*/
		int random = (int)(Math.random()*26);
		char ch = (char)('a'+random);
		switch(ch){
			/*
			case 'a':
			System.out.println("元音："+ch);
			break;
			case 'e':
			System.out.println("元音："+ch);
			break;
			case 'i':
			System.out.println("元音："+ch);
			break;
			case 'o':
			System.out.println("元音："+ch);
			break;
			case 'u':
			System.out.println("元音："+ch);
			break;
			case 'y':
			System.out.println("半元音："+ch);
			break;
			case 'w':
			System.out.println("半元音："+ch);
			break;
			default:
			System.out.println("辅音："+ch);*/
			case 'a':
			case 'e':
			case 'i':	
			case 'o':
			case 'u':
			System.out.println("元音："+ch);
			break;
			case 'y':
			case 'w':
			System.out.println("半元音："+ch);
			break;
			default:
			System.out.println("辅音："+ch);
		}
					
	}
}
```

### 循环结构：
#### 1. while

先进行判断，再进行逻辑执行

​		需要四部分组成
​			初始化：变量的初始化
​			条件判断：必须要求返回true或者false的值
​			循环体：具体的要执行的逻辑代码
​			迭代变量：促使此循环结束

#### 2. do while

先执行代码逻辑，再执行判断

```java
public class WhileDemo{
	
	public static void main(String [] args){
		
		
		//while循环样例
		/*
		int i = 1;
		while(i<=100){
			System.out.println("第"+i+"遍输出");
			i++;
		}
		*/
		
		//求100内的偶数和
		/*
		int i = 1;
		//求和最终的存储变量
		int sum = 0;
		while(i<=100){
			if(i % 2 == 0){
				sum+=i;
			}
			i++;
		}
		System.out.println("100以内的偶数和是："+sum);
		*/
		
		// do while
		/*
		int i = 1;
		do{
			System.out.println("第"+i+"遍输出");
			i++;
		}while(i<=100);
		*/
		int i = 1;
		int sum = 0;
		do{
			if(i % 2 == 0){
				sum+=i;
			}
			i++;
		}while(i<=100);
		System.out.println("100以内的偶数和是："+sum);
		
	}
}
```

####  3. for 

第三种循环结构是for循环，使用最多

	语法规则：
		for(初始化1;条件表达式2;步进器4){
			代码逻辑3
		}
	使用for循环的好处：
		1、代码简洁
		2、变量初始化的时候，for循环的作用域仅仅是当前for循环结构
			while循环的作用域是从变量的定义开始到整个方法结束
		
```java
public class ForDemo{
	public static void main(String[] args){
		/*
		for(int i = 1;i<=100;i++){
			System.out.println("第"+i+"遍输出");
		}
		
		//100以内的偶数和
		int sum = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("100以内的偶数和是："+sum);
		*/
		for(int i =1;;){
			System.out.println(i);
		}
	}
}
```

#### return有两基本用途
​	1、返回方法的返回值
​	2、终止当前程序

```
public class ReturnDemo{
	
	public static void main(String[] args){
		
		System.out.println(get());
		for(int i = 0;i<10;i++){
			System.out.println(i);
			if(i==5){
				return;
				//System.exit(100);
			}
			System.out.println("接着执行");
		}
		
	}
	
	public static int get(){
		return 100;
	}
}
```

#### 各种例子

## 05 数组

数组表示存储相同数据类型数据的有序集合
	特点：
		1、数组中存放的数据必须是同一个数据类型，可以是基本数据类型也可以是引用数据类型
		2、数组在定义的时候必须要给定大小，且大小不可以改变
		3、可以通过下标值来获取数据，下标从0开始
		4、插入数组中的数据是有序集合，此时有序并不是指代大小排序，而是指插入的顺序
	使用：
		1、声明数组
		2、创建空间
		3、赋值
		4、数组操作

```java
public class ArrayDemo{
	
	public static void main(String[] args){
		
		/*
		//声明数组
		int[] array;
		//创建内存空间
		array = new int[5];
		//数组赋值
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		//数组操作
		System.out.println(array[0]);
		
		//数组的几种创建方式
		//1、声明并申请空间
		int[] arr1 = new int[5];
		int [] arr2 = new int[5];
		int  arr3[] = new int[5];
		//2、声明数组并赋值
		int[] arr4 = new int[]{1,2,3,4,5};
		//3、直接初始化操作
		int[] arr5 = {1,2,3};
		
		//获取数组的长度
		System.out.println(arr1.length);
		
		//输入5个数值，求平均值
		int[] arr6 = new int[]{56,98,34,89,100};
		int sum = 0;
		for(int i = 0;i<arr6.length;i++){
			sum+=arr6[i];
		}
		System.out.println("平均值是："+sum/arr6.length);
		*/
		
		/*
		数组是引用类型，当创建完成数组之后相当于是在方法外定义了一个变量，此时数组中的值是有默认值的
			默认是什么，取决于你定义的数组的类型：
			int:0
			String null
			boolean false
		数组可以根据下标获取值，但是获取的时候下标的范围是[0,length-1]
		*/
		int[] array = new int[5];
		System.out.println(array[0]);
		
	}
}

```

数组相当于数据结构的一种实现，很多数据在进行存储的时候需要使用数组
	数据结构：
		线性表
		非线性表
		树
		图
		队列
		栈
数组经常会用来考排序算法：
	面试需求：
		1、写出某种排序算法
			冒泡排序
			选择排序
			插入排序
			快速排序
		2、排序算法的时间复杂度（空间复杂度）
			衡量一个数据结构是否合适的衡量标准
		3、排序算法的稳定性
			排序之后的值跟排序之前的值位置是否发生变化

```java
public class ArraySort{
	
	public static void main(String[] args){
		//定义数组
		int[] array = new int[]{4,1,7,2,9,3,5,8,6};
		//将数组进行排序操作，从小到大
		//冒泡排序
		/*
		for(int i=0;i<array.length;i++){
			for(int j = 0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		*/
		
		//选择排序
		/*
		for(int i = 0;i<array.length;i++){
			for(int j = i+1;j<array.length;j++ ){
				if(array[i]>array[j]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		*/
		Arrays.sort(array);
		
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}	
	}
}
```

**二维数组**可以称作数组的数组
	定义二维数组的时候一定需要注意，必须要给定数组的长度

```
public class TwoArray{
	
	public static void main(String[] args){
		
		int[] arr = new int[6];
		int[][] arr2 = new int[3][];
		//创建二维数组的对象
		arr2[0] = new int[5];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		//赋值
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;
		
		arr2[1][0] = 6;
		arr2[1][1] = 7;
		arr2[1][2] = 8;
		
		arr2[2][0] = 9;
		arr2[2][1] = 10;
		arr2[2][2] = 11;
		arr2[2][3] = 12;
		
		for(int i = 0;i<arr2.length;i++){
			for(int j = 0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
```

#### 数组例子

## 06 Java面向对象编程



## 07 面向对象编程2



## 08 异常处理



## 09 常用类



## 10 Java容器



## 11 IO



## 12 多线程



## 13 线程池



## 14 网络



## 15 lambda表达式



## 16 Stream API



## 17 自定义注解

