package basic;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/31 11:00
 * Description:
 * -
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
 *
 * 数组的常见概念
 *   数组名
 *   下标(或索引)
 *   元素
 *   数组的长度
 *
 * 数组本身是引用数据类型，而数组中的元素可以是任何数据类型，包括
 * 基本数据类型和引用数据类型。
 *   创建数组对象会在内存中开辟一整块连续的空间，而数组名中引用的是这块连续空间的首地址。
 *   数组的长度一旦确定，就不能修改。
 *   我们可以直接通过下标(或索引)的方式调用指定位置的元素，速度很快。
 *   数组的分类：
 *   按照维度：一维数组、二维数组、三维数组、…
 *   按照元素的数据类型分：基本数据类型元素的数组、引用数据类型元素的数组(即对象数组)
 *
 *
 *
 *一维数组的声明方式：
 *  type var[] 或 type[] var；
 *
 * 数组是引用类型，它的元素相当于类的成员变量，因此数组一经分配空间，其中的每个元素也被按照成员变量同样的方式被隐式初始化。
 * 若未赋值，元素默认值为0
 *     对于基本数据类型而言，默认初始化值各有不同（byte shot int long double分别是0 0 0 0L 0.0）
 *     对于引用数据类型而言，默认初始化值为null(注意与0不同！)
 *
 *
 * 二维数组：
 * 格式1（动态初始化）：int[][] arr = new int[3][2];
 *      定义了名称为arr的二维数组
 *      二维数组中有3个一维数组
 *      每一个一维数组中有2个元素
 *      一维数组的名称分别为arr[0], arr[1], arr[2]
 *      给第一个一维数组1脚标位赋值为78写法是：arr[0][1] = 78;
 * 格式2（动态初始化）：int[][] arr = new int[3][];
 *      二维数组中有3个一维数组。
 *      每个一维数组都是默认初始化值null (注意：区别于格式1）
 *      可以对这个三个一维数组分别进行初始化
 *      arr[0] = new int[3]; arr[1] = new int[1]; arr[2] = new int[2];
 * 注：
 *  int[][]arr = new int[][3]; //非法
 *
 *
 * 格式3（静态初始化）：int[][] arr = new int[][]{{3,8,2},{2,7},{9,0,1,6}};
 *      定义一个名称为arr的二维数组，二维数组中有三个一维数组
 *      每一个一维数组中具体元素也都已初始化
 *      第一个一维数组 arr[0] = {3,8,2};
 *      第二个一维数组 arr[1] = {2,7};
 *      第三个一维数组 arr[2] = {9,0,1,6};
 *      第三个一维数组的长度表示方式：arr[2].length;
 *      注意特殊写法情况：int[] x,y[]; x是一维数组，y是二维数组。
 *      Java中多维数组不必都是规则矩阵形式
 */

public class ArraryDemo {
    static int arrlist[] = new int[3];//数组在类中定义时要加static，且不能直接在类中赋值；

    public static void main(String[] args) {

        int a[];
        a = new int[3];

        int[] b;
        double[] c;

        String[] d;
        d = new String[3];
        //Java语言中声明数组时不能指定其长度(数组中元素的数)， 例如： int a[5]; //非法

        //标准声明如下：
        int[] arr = new int[3];
        arr[0]=2;
        arr[1]=4;
        arr[2]=6;
        //或者：
        String names1[]= new String[]{"zhang3","li4","wang5","zhao6","ma7","zhou8"};

        String names[];
        names= new String[3];
        names[0]="张三";
        names[1]="李四";
        names[2]="王五";

        arrlist[0]=1; //类中定义的数组可以在方法中使用

        //引用数组中的元素
        System.out.println(names[0]);
        System.out.println("---------------------------");

        //循环打印出数组中所有元素
        for(int i=0; i<3;i++){
            System.out.println(names[i]);
        }
        System.out.println("---------------------------");

//        System.out.println(names.length);


        int[][] arr1 = new int[3][2];
        System.out.println(arr1.length);

        int[][] arr2 = new int[3][];
        arr2[0] = new int[5];
        arr2[1] = new int[3];
        arr2[2] = new int[4];
    }

}
