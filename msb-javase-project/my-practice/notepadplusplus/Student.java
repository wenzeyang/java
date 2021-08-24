package notepadplusplus;

import java.util.Scanner;

public class Student {
    //属性定义：
    int stuNumber;
    String name;
    int age = 20;
    //方法定义：
    void study(){
        System.out.println("I am learning");
    }
    void eat(String food){
        System.out.println("i am eating " + food);
    }

    public static void main(String[] args) {
        //创建对象student
        Student student = new Student();
        student.stuNumber = 20210728;
        student.age = 28;
        student.name = "vic yang";
        System.out.println(student.stuNumber);
        System.out.println(student.age);
        System.out.println(student.name);
        student.eat("apple");

        //创建对象xiaoming
        Student xiaoming = new Student();
        xiaoming.eat("banana");

        //alt + enter 自动修正
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生姓名： ");
//        student.name = sc.next();
//        System.out.println("请输入年龄");
//        student.age = sc.nextInt();

        //字符串变量等于某个字符串，用 变量.equals()
        //数值变量等于某个值，用 == 表示即可
//        if(student.name.equals("admin") && student.age==18){
//            System.out.println("this student meets the requirements! ");
//        }else{
//             System.out.println("this student doesn't meet the requirements!");
//        }
        //猜名字游戏
        Scanner guessInput = new Scanner(System.in);


        while(true){
            System.out.println("start the name-guessing game... ");
            System.out.println("请输入学生姓名： ");
            student.name = guessInput.next();
            System.out.println("请输入年龄");
            student.age = guessInput.nextInt();

            if(student.name.equals("beauty") && student.age==18){
                System.out.println("the teen girl meets the requirements! ");
                break;
            }else{
                System.out.println("the teen girl doesn't meet the requirements!");
            }
        }

    }

}
