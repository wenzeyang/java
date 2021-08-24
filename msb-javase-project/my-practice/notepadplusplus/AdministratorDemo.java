package notepadplusplus;
public class AdministratorDemo {
    String name = "admin";
    int age = 18;
    String id = "330226198812193678";
    void eat(String paras){
        System.out.println(name + " eat " + paras);
    }
    String play() {
        return (name + " play !");
    }

    public static void main(String[] args ){
        AdministratorDemo admin = new AdministratorDemo();
        admin.name = "vic";
        admin.age = 19;
        admin.id = "330226198812193678";
        admin.eat("banana");
        String s = admin.play();
        System.out.println(s);
    }
}

