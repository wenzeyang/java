
package notepadplusplus;

public class Fibonacci {
    public static void main(String[] args) {
        for(double count=1e0;count<=100e0;count++){
            System.out.println(count+" : " + getNumber(count)+"\t");
        }
    }

    public static double getNumber(double number) {
        if (number == 1 || number == 2) {
            return 1;
        }else{
            return getNumber(number-1) + getNumber(number-2);
        }
    }
}
