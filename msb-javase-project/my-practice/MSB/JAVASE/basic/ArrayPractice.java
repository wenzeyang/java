package basic;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/31 14:20
 * Description:
 * -
 */
public class ArrayPractice {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        //赋值方法一：
//        arr[0] = new int[3];
//        arr[1] = new int[2];
//        arr[2] = new int[4];
//        arr[0][0]=3;
//        arr[0][1]=5;
//        arr[0][2]=8;
//        arr[1][0]=12;
//        arr[1][1]=9;
//        arr[2][0]=7;
//        arr[2][1]=0;
//        arr[2][2]=6;
//        arr[2][3]=4;

        //赋值方法二：
        arr[0] = new int[]{3,5,8};
        arr[1] = new int[]{12,9};
        arr[2] = new int[]{7,0,6,4};

        //System.out.println(arr[1][2]); ===> 超出边界


        for(int i=0;i<3;i++){
            //System.out.println("--------");
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("--------");
        }

    }



}
