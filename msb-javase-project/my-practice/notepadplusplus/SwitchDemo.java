package notepadplusplus;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入号码快捷键：");
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("拨打爸爸电话");
                break;
            case 2:
                System.out.println("拨打妈妈电话");
                break;
            case 3:
                System.out.println("拨打儿子电话");
                break;
            default:
            System.out.println("拨打女儿电话");

        }
    }

}
