package notepadplusplus;

public class test_if {
    public static void main(String[] args){
        double i = 6 * Math.random();
        int x = (int)i;
        if(x > 3){
            System.out.println("x is large and x == " + x);
        }else{
            System.out.println("x is small and x == " + x);
        }
    }
}
