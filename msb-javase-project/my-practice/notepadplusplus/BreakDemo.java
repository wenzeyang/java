package notepadplusplus;
public class BreakDemo {
    public static void main(String[] args) {
        int count = 1;
        while(true){
            int number = (int)(Math.random()*101);
            if(number==88){
                System.out.println("第"+count+"次："+"终于到88了");
                break;
            }
            System.out.println("第"+count+"次：" + "数字为"+number);
            count++;
        }
    }
}
