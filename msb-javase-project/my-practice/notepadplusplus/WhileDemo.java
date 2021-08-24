package notepadplusplus;

public class WhileDemo  {
    public static void main(String[] args) {
        int i = 0;
        int totalsum = 0;
        while(i <= 100){
            i += 1;
            totalsum = totalsum + i;
        }
        System.out.println("total number is " + totalsum);
    }
}
