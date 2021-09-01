package basic;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/31 14:44
 * Description:
 * - 打印一组20行杨辉三角形
 * 失败！！！
 */
public class ArraryPractice4 {
    public static void main(String[] args) {

        int n = 5;

        int[][] arrYH = new int[n][];
        for(int i=0;i<n;i++){
            arrYH[i] = new int[i+1];
        }

        arrYH[0][0]=1;
        arrYH[1][0]=1;
        arrYH[1][1]=1;


        for(int i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    if(i<2){
                        arrYH[i][j]=1;
                    }else{
                        if(j==0){
                            arrYH[i][j]=1;
                            //arrYH[3][0]=1;
                        }else{
                            //i=3,j=1;
                            //i=3;j=2;
                            arrYH[i][j]=arrYH[i-1][j-1]+arrYH[i-1][j];
                            //arrYH[3][1]=arrYH[2][0]+arrYH[2][1];
                            //arrYH[3][2]=arrYH[2][1]+arrYH[2][2];
                            //System.out.println("test");
                        }

                    }
                    System.out.print(arrYH[i][j]+" ");
                }
                System.out.println("-------");

        }

    }
}
