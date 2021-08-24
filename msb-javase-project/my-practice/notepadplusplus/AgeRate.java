package notepadplusplus;

import java.util.Scanner;

public class AgeRate {
    public static void main(String[] args) {
        int large30 = 0;
        int little30 = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.print("请输入客户"+i+"年龄： ");
            int userInput = sc.nextInt();
            if (userInput >= 30){
                large30++;
            }else{
                little30++;
            }
        }
        System.out.println("超过30岁的人百分比为："+large30/10.0*100+"%");
        System.out.println("不超过30岁的人百分比为："+little30/10.0*100+"%");
    }
}
