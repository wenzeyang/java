package notepadplusplus;/*
变量
月份：month（月份）
仓位：firstClass（头等舱）、economyClass（经济舱）
折扣价：discountPrice（折扣价）、originPrice（原价）

接受输入：
import java.util.Scanner;
public class Person{
//定义Scanner类
Scanner input = new Scanner(System.in);
System.out.print("请输入姓名");
//接收用户输入的字符串类型变量：
String name = input.next();
System.out.print("请输入年龄");
//接收用户输入的整型变量：
String age = input.nextInt();
}

*/

import java.util.Scanner;

public class airTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("头等舱（F）或经济舱 (E):请输入E or F : ");
        String classLevel = input.next();
        System.out.print("请输入月份： （1-12）");
        int month = input.nextInt();
        System.out.println("请确认： 仓位：" + classLevel + " 月份：" + month);
        double originalPrice = 5000;
        if (month >= 4 && month <= 10) {
            if (classLevel.equals("E")) {
                System.out.println(originalPrice * 0.9);
            } else {
                System.out.println(originalPrice * 0.8);
            }
        } else {
            if (classLevel.equals("E")) {
                System.out.println(originalPrice * 0.5);
            } else {
                System.out.println(originalPrice * 0.4);
            }
        }
    }
}
