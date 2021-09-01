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


​	

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

## 05 数组及集合

#### 数组

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



#### 集合



## 06 Java面向对象编程

### 面向对象程序设计概述

```
/*
* 代码块：  使用{}括起来的一段代码叫做代码块
* 分类：
*   普通代码块:定义在方法中，使用{}括起来的代码叫做普通代码块
*   构造代码块：定义在类中的使用{}括起来的代码叫做构造代码块
*           注意：每次代码运行的时候回将构造代码块中的代码添加到构造方法的前面
*                   构造代码块中的代码会添加到每一个构造方法中，当使用this(参数)的时候不会添加
*   静态代码块：使用static{}括起来的代码叫做静态代码块，在程序载入的时候优先执行
*           数据库连接等其他提前需要准备好的代码会放在static代码块
*   同步代码块：
*           在多线程的时候回使用，用来给共享空间进行加锁操作（后面讲）
*   执行顺序：静态代码块--》构造代码块（创建对象的时候才会用到）--》普通代码块
* */
```

### 预定义类

```
/*
* 字符串在比较的时候：
*  ==：比较的是地址
*  equals:比较的是具体的值
* */
```



### 用户自定义类

```
/*
* 所有类定义的时候可以添加属性和方法，但不是必须要写的
*   一个java文件中可以定义N多个class，但是只能有一个public class并且public class的类名跟文件名保持一致
* 属性：
*   语法：
*   [访问修饰符]    数据类型      属性名称  =  值；
*
*   注意：
*       定义属性的时候可以有值也可以没有值(有默认值)
*       必须要包含类型和名称
*
*
* 方法：表示行为
*   语法：
*       [访问修饰符]  返回值类型(任何类型)  方法名称（形参列表）{
*               逻辑代码
*
*       }
*   注意：
*       1、方法的访问修饰符可以不写
*       2、方法可以有返回值，也可以没有，***void表示没有返回值的意思***
*       3、形参列表可以有，也可以没有
*       4、java中方法的传参都是值传递（后续会讲）
*
* 对象的创建和使用
*       1、使用new关键字来创建对象
*       ClassName objectName = new ClassName();
*       2、对象的使用
*           使用对象的时候可以通过 对象名称.属性 或者 对象名称.方法 来使用属性和方法
* */
```


```
/*
* 在java中明确定义了访问权限：
*          限制访问，以下分类按照从大到小进行排列
*       public:公共的
*           当前项目的所有的类都可以进行访问
*       protected:受保护的
*           可以被当前类访问，可以被当前包访问，也可以被子类访问
*       default:默认权限
*           可以被当前类访问，可以被当前包访问，
*       private:私有权限
*           只能被当前类访问
*
*       注意：四种访问修饰符可以修饰属性和方法
*       类的访问修饰符只有两个  public default
*
* */
```

```
/*
*   定义类的时候需要包含以下组件：
*       私有属性
*       构造方法（无参构造方法和自定义构造方法）
*       set/get方法
*       普通方法
*
* */
```


```
/*
* 封装：
*       概念：
*           将类的某些信息隐藏在类内部，不允许外部程序直接访问，
*           而是通过该类提供的方法来实现对隐藏信息的操作和访问
*       封装解决什么问题：
 *          如果任何一个处理类都可以直接对Dog进行赋值操作，那么当值不准确的时候，可以回产生额外的结果，
*           如何在赋值的同时添加一些逻辑判断呢？
*               封装可以解决此问题
*       作用：
*           使用封装可以保证数据的规范，不符合规范的数据将无法进行操作
*       好处：
*           1、隐藏类的内部实现细节
*           2、只能通过提供的方法进行访问，其他方法无法访问
*           3、可以根据需求添加复杂的逻辑判断语句
*           4、方便修改实现
*       面向对象的封装（狭义）可以用一句话概述： 为了保证数据安全和规范
*           将类中的属性设置为私有属性，提供共有的外部方法供程序进行调用，可以实现丰富的细节操作
*       广义的封装：
*           可以将完成特定功能的代码块封装成一个方法，供不同的程序进行调用
* */
```



### 静态域域静态方法

```
/*
* static:
*       修饰成员变量的时候，表示静态成员变量或者叫类变量
*           普通变量在使用的时候，必须要通过对象名进行调用
*           类变量或者静态变量可以使用对象名调用也可以使用类名进行调用
*       修饰方法的时候，表示静态方法或者叫类方法
*           普通方法在使用的时候，必须要通过对象名进行调用
*           类方法或者静态方法可以使用类名，也可以使用对象名
*       注意：
*           1、静态变量，在创建对象之前被初始化，或者说在类被载入之前进行初始化
*           2、静态变量被所有的对象共享，属于公共变量，对象和类都可以直接调用，但是推荐使用类来调用
*           3、成员变量放在堆中，而静态变量放在方法去中静态区
				//java1.8之前内存区域分为方法区、堆内存、虚拟机栈、本地方法栈、程序计数器
				//很多人都更愿意把方法区称为“永久代”(Permanent Generation)。从jdk1.7已经开始准备“去永久代”的规划，					//jdk1.7的HotSpot中，已经把原本放在方法区中的静态变量、字符串常量池等移到堆内存中。
*           4、静态变量不能定义在静态方法中  --why  
				//不光不能在静态方法中定义静态变量，在非静态方法中更不能。java是不允许这种情况的出现。
				//因为静态变量是全局变量（类变量），在程序的任何地方都能访问。
*           5、静态方法可以在非静态方法中进行调用
*           6、静态方法中不能直接调用非静态方法
*           7、静态方法中不允许出现this调用
*           8、一般工具类中的方法定义为static
* */
```

### 方法参数

```
/*
*
* 方法参数的值是否改变
*       方法中的参数列表叫做形式参数，没有具体的值，只是为了方便在方法体中使用
*       调用方法的时候实际传入的值叫实际参数，代表具体的数值，用来替换在方法体中代码逻辑的值进行运算
*       注意：
*           1、形式参数的变量名称也是局部变量
*           2、当方法的参数值是基本数据类型的时候，不会改变原来的值
*           3、当方法的参数值是引用类型的时候，如果改变了该引用类型的值，会改变原来对象的值
*       java中的参数传递是值传递
* */
```

### 包

```
/*
* package:包，对应到文件系统就是多级目录
*   为了解决两个问题：
*       1、文件同名问题
*       2、为了方便管理类，将具体处理功能的代码放到同一个目录下
*   使用：
*       一般定义package会放置在java文件的第一行
*           package 域名的倒写
*           package com.mashibing.
*   完全限定名： 包名+类名
*
*   JDK中常用的包：
*       lang：不需要手动导入，自动加载
*       util:工具包
*       net:网络包
*       io:输入输出流包
*
*/
```

### 类路径

### 文档注释

### 类设计技巧



## 07 面向对象编程2



### 继承

```
/*
* 继承：
*   表示父类跟子类之间的关系
*   当两个类或者多个类具备相同的属性和方法的时候，可以提取出来，变成父类，子类可以继承
*
*   子类跟父类是is-a的关系
*
*   使用：
*       1、使用继承的时候需要使用extend关键字
*       2、使用继承关系之后，父类中的属性和方法都可以在子类中进行使用(非私有属性和非私有方法)
*       3、java中是单继承关系(如果包含多个父类，同时父类中包含重名方法，无法决定改调用谁)
*
*
* super:是 直接父类 对象的引用
*   用途：
*       1、可以在子类中调用父类中被子类覆盖的方法  super.父类方法名称
*       2、当super在普通方法中使用的话，可以任意位置编写
*       3、当super在构造方法中使用的话，会调用父类的构造方法，一定要将super放在第一行
*       4、在构造方法中super关键字和this关键字不能同时出现
*       5、父类中私有的属性和方法都不能被调用，包括构造方法
*       6、子类的构造方法中都会默认使用super关键字调用父类的无参构造方法,因此在定义类的时候，无论自己是否自定义了
*               其他构造方法，最好将无参构造方法写上
*       7、如果构造方法中显式的指定了super的构造方法，那么无参的构造方法就不会被调用
*
*   总结：
*       1、在创建子类对象的时候一定会优先创建父类对象
*       2、所有的java类都具备同一个老祖宗类，称之为Object，是所有类的根类
*
* 重写：
*   必须要存在继承关系，当父类中的方法无法满足子类需求的时候可以选择使用重写的方式
*   注意：
*       1、重写表示的是子类覆盖父类的方法，当覆盖之后，调用同样的方法的时候会优先调用子类
*       2、重写的方法名称，返回值类型，参数列表必须跟父类一直
*       3、子类重写的方法不允许比父类的方法具备更小的访问权限
*           父类      public     子类  public
*           父类      protected     子类  public protected
*           父类      protected     子类  public protected  default
*   父类的静态方法子类可以进行调用，但是子类不可以重写
* */
```



### 多态

有一个用来判断是否应该设计为继承关系的简单规则， 这就是“ is-a” 规则， 它表明子类的每个对象也是超类的对象。例如， 每个经理都是雇员， 因此， 将 Manager 类设计为 Employee 类的子类是显而易见的，反之不然， 并不是每一名雇员都是经理。  

```
例如， 可以将一个子类的对象赋给超类变量。
Employee e;
e = new Employee(. . .); // Employee object expected
e = new Manager(. . .); // OK, Manager can be used as well

在 Java 程序设计语言中， 对象变量是多态的。 一个 Employee 变量既可以引用一个Employee 类对象， 也可以引用一个 Employee 类的任何一个子类的对象（例如， Manager、Executive、 Secretary 等） 
```

```
/*
* 多态：
*       对应同一个指令（调用同一个名称的方法），不同的对象给予不同的反应（不同的方法实现）
*   规范(多态实现的提前)：
*       1、必须要有继承关系
*       2、子类方法必须重写父类的方法
*       3、父类引用指向子类对象
*   多态的目的：
*       为了提高代码的扩展性和维护性
*       方便代码逻辑的编写
*   多态的两种表现形式：
*       1、父类作为方法的参数
*       2、父类作为方法的返回值类型
*
*   引用类型的转换跟基本数据类型的转换类似：
*       1、当父类需要转成子类的时候，要进行强制转换，但是在强制转换之前一定要先判断父类引用指向的子类对象到底是谁，
*           如果无法确定，在运行过程中可以出错
*       2、当子类需要向父类转换的时候，直接自动转换，不需要进行任何的判断。
* */
```

```

```

### 抽象类



### 接口



### 内部类

```
/*
* 内部类（当作类中的一个普通成员变量，只不过此成员变量是class的类型）：
*       一个java文件中可以包含多个class，但是只能有一个public class
*       如果一个类定义在另一个类的内部，此时可以称之为内部类
*   使用：
*       创建内部类的时候，跟之前的方法不一样，需要在内部类的前面添加外部类来进行修饰
*             InnerClassDemo.InnerClass inner = new InnerClassDemo().new InnerClass();
    特点：
        1、内部类可以方便的访问外部类的私有属性
        2、外部类不能访问内部类的私有属性,但是如果创建了内部类的对象，此时可以在外部类中访问私有属性
        3、内部类中不能定义静态属性
        4、当内部类和外部类具有相同的私有属性的时候，在内部类中访问的时候，可以直接访问内部类的属性，
            如果需要访问外部类的属性，那么需要添加  外部类类名.this.属性。
    分类：
        匿名内部类：当定义了一个类，实现了某个接口的时候，在使用过程中只需要使用一次，没有其他用途
               其实考虑到代码编写的简洁，可以考虑不创建具体的类，而采用new interface(){添加未实现的方法}
               就叫做匿名内部类
        静态内部类：在内部类中可以定义静态内部类，使用static关键字进行修饰，使用规则
                外部类.内部类 类的引用名称 = new 外部类.内部类（）；
        方法内部类：在外部类的方法中也可以定义类，此时叫做方法内部类（了解即可）
                    使用的时候需要注意，只能在方法中创建对象，因为此class的作用域就是当前方法


 * */
```

```
例子：
public class InnerClassDemo {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");
//        System.out.println(age);
        InnerClass inner = new InnerClass();
        System.out.println(inner.age);
    }

    class InnerClass{
        private int age;
//        static String name = "zhangsan";

        public void test(){
            System.out.println("test");
            System.out.println(id);
            System.out.println(name);
        }

        class InnerInner{
            private int id;
            public void print(){
                System.out.println("print");
            }
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClassDemo().new InnerClass();
    }
}
------------------------------------------------------------------------------
public class TestInnerClass {
    public static void main(String[] args) {
//        System.gc();
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.show();
        System.out.println(innerClassDemo.getName());

        InnerClassDemo.InnerClass inner = new InnerClassDemo().new InnerClass();
        inner.test();
//        System.out.println(inner.age);

        InnerClassDemo.InnerClass.InnerInner innerInner = new InnerClassDemo().new InnerClass().new InnerInner();
    }
}
```

## 10 异常处理

### 1.处理错误

```
/*
 * 异常:
 *       在程序运行过程中，出现的不正常情况叫做异常
 *
 *       注意：
 *           1、相同的代码在运行的时候，根据输入的参数或者操作的不同，有可能会发生异常，有可能不会发生异常
 *               应该在写代码的过程中尽可能的保证代码的正确性，不要到处都bug
 *           2、如果要解决代码中出现的异常，需要添加非常复杂的代码逻辑来进行判断，会使代码变得非常臃肿，不利于维护，可读性比较差
 *               因此，推荐大家使用异常机制来处理程序运行过程中出现的问题
 *           3、程序在运行过程中如果出现了问题，会导致后面的代码无法正常执行，而使用异常机制之后，可以对异常情况进行处理
 *              同时后续的代码会继续执行，不会中断整个程序
 *           4、在异常的处理过程中，不要只是简单的输出错误，要尽可能的讲详细的异常信息进行输出
 *                  e.printStackTrace():打印异常的堆栈信息，可以从异常信息的最后一行开始追踪，寻找自己编写的java类
 *

```

### 2.捕获异常

```
 *      异常处理的方式：
 *          1、捕获异常
 *              try{代码逻辑}catch(Exception e){异常处理逻辑}
 *              try{代码逻辑}catch(具体的异常Exception e){异常处理逻辑}catch(具体的异常)：
 *                    可以针对每一种具体的异常做相应的更丰富的处理
 *                      注意：当使用多重的catch的时候一定要注意相关异常的顺序，将子类放在最前面的catch，父类放在后面的catch
 *              执行过程中可能存在的情况：
 *                  1、正常执行，只执行try中的代码
 *                  2、遇到异常情况，会处理try中异常代码之前的逻辑，后面的逻辑不会执行，最后会执行catch中的代码
 *                  3、使用多重catch的时候，会遇到异常子类不匹配的情况，此时依然会报错，因此建议在catch的最后将所有的异常的父类写上
 *InputMismatchException
 * ArithmeticException
 * */
```

例子

```java
public class TestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
            System.out.println("前面没有出现异常");
        /*}catch(Exception e){
//            System.out.println("出现异常");
            e.printStackTrace();   //输出异常的堆栈信息的方法
//            System.out.println("--------");
            System.out.println(e.getMessage());
        }*/
       }catch(ArithmeticException e){
            System.out.println("数学异常，除数不能是0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("输入的参数值类型不匹配");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("感谢使用本程序！");

    }
}
```

finally

```
/*
* 在程序运行过程中，如果处理异常的部分包含finally的处理，那么无论代码是否发生异常，finally中的代码总会执行
*   finally包含哪些处理逻辑？
*       1、IO流的关闭操作一般设置在finally中
*       2、数据库的连接关闭操作设置在finally中
*
* */
```

例子

```
public class FinallyDemo {
    public static void main(String[] args) {


    }

    public static void test(){
        try{
            System.out.println(1/10);
            return;
        }catch (Exception e){
            e.printStackTrace();
            return;
        }finally {
            System.out.println("我是finally处理块");
            return;
        }
    }
}
```

自定义异常

```
/*
* 自定义异常：
*       在java的api中提供了非常丰富的异常类，但是在某些情况下不太满足我们的需求，此时需要自定义异常
*       步骤：
*           1、继承Exception类
*           2、自定义实现构造方法
*           3、需要使用的时候，使用throw new 自定义异常的名称；
*       什么时候需要自定义异常？
*           一般情况下不需要
*           但是在公司要求明确，或者要求异常格式规范统一的时候是必须要自己实现的
*
* */
```

例子

```
public class GenderException extends Exception {

    public GenderException(){
        System.out.println("性别异常");
    }

    public GenderException(String msg){
        System.out.println(msg);
    }
}
```

### 3.使用异常机制技巧

### 4.使用断言

断言是什么？？

在java语言中，给出了3种处理系统错误的机制：

​	1）抛出一个异常

​	2）日志

​	3）使用断言

什么时候选择断言？

	- 断言失败是致命的、不可恢复的错误
	- 断言检查只用于开发和测试阶段

### 5.记录日志

### 6.调试技巧

## xx 常用类



## xx Java容器



## xx IO



## xx 多线程



## xx 线程池



## xx 网络



## xx lambda表达式



## xx Stream API



## xx 自定义注解

