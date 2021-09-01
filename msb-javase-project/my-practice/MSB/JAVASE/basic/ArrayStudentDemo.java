package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/31 11:48
 * Description:
 * -
 */
public class ArrayStudentDemo {

    public void inputGrade(){
        Scanner sc = new Scanner(System.in);
        int[] scoreList = new int[5];

        for(int i=0; i < 5; i++){
            System.out.print("请输入第"+i+"个学生分数：");
            scoreList[i] = sc.nextInt();
            System.out.println("学生:"+i+"分数为："+ scoreList[i]);
        }

        //求最大值
        int max = Arrays.stream(scoreList).max().getAsInt();
        System.out.println(max);
        int A = max - 10;
        int B = max - 20;
        int C = max - 30;

        for(int i=0;i<5;i++){
            if(scoreList[i] >= A){
                System.out.println("学生"+i+"的成绩为A");
            }else if(scoreList[i] >= B){
                System.out.println("学生"+i+"的成绩为B");
            }else if(scoreList[i] >= C){
                System.out.println("学生"+i+"的成绩为C");
            }else{
                System.out.println("学生"+i+"的成绩为D");
            }
        }


    }

    public static void main(String[] args) {
        ArrayStudentDemo arrayStudentDemo = new ArrayStudentDemo();
        arrayStudentDemo.inputGrade();
    }
}
