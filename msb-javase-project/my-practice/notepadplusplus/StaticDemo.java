package notepadplusplus;

public class StaticDemo {
    int id = 123;
    String name = "zhangsan";
    static int id2 = 456;
    static String name2 = "lisi";

    public static void main(String[] args){
        //不创建对象，直接打印类的属性
        //System.out.println(StaticDemo.id);
        //System.out.println(StaticDemo.name);
        System.out.println(StaticDemo.id2);
        System.out.println(StaticDemo.name2);

        //创建对象，打印类的属性、打印对象的属性
        StaticDemo st = new StaticDemo();

        //System.out.println(StaticDemo.id);
        //System.out.println(StaticDemo.name);
        System.out.println("StaticDemo.id2: "+StaticDemo.id2);
        System.out.println("StaticDemo.name2: "+StaticDemo.name2);
        System.out.println("st.id: "+ st.id);
        System.out.println("st.name: "+st.name);
        System.out.println("st.id2: "+st.id2);
        System.out.println("st.name2: "+st.name2);

        System.out.println("--------------");
        st.id = 123123;
        st.name = "san-zhang";
        st.id2 = 654654;
        st.name2 = "si-li";
        System.out.println("st.id: "+ st.id);
        System.out.println("st.name: "+st.name);
        System.out.println("st.id2: "+st.id2);
        System.out.println("st.name2: "+st.name2);

        //StaticDemo.id = 789;
        StaticDemo.id2 = 789;
    }
}
