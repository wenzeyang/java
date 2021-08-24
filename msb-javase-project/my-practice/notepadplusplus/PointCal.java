package notepadplusplus;

public class PointCal {
    double x=0 ;
    double y=0 ;
//    public PointCal(double x, double y){
//        x = 0;
//        y = 0;
//    }
    void Calcultor(double oldx, double oldy, double newx, double newy){
        double distance = Math.sqrt(Math.pow((newx-oldx),2)+Math.pow((newy-oldy),2));
        System.out.println(distance);

    }
    public static void main(String[] args){
        PointCal pc = new PointCal();
        pc.Calcultor(1,1,3,3);
    }
}
