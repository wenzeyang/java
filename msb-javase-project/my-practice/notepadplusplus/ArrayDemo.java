package notepadplusplus;
import javax.lang.model.type.ArrayType;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrayInt1 = new int[5];
        arrayInt1[0]=0;
        arrayInt1[1]=1;
        arrayInt1[2]=2;
        arrayInt1[4]=4;
        // System.out.println(arrayInt1[3]);

        int[] arrayInt2 = new int[]{6,7,8,9,10};
        // System.out.println(arrayInt2[0]);
        //打印数组方法一
        for(int i=0; i<(arrayInt2.length);i++ ){
            System.out.print(arrayInt2[i]+"\t");
        }

        //打印数组方法二
        System.out.println("\n-------------------- ");
        for(int a :arrayInt2){
            System.out.println(a);
        }

    }
}
