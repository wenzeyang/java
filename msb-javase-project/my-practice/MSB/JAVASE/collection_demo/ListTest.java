package collection_demo;

import collection.ArrayListDemo;
import java.util.ArrayList;
import java.util.List;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/28 10:56
 * Description:
 * -
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        DogClass dog1 = new DogClass("大黄", 90);
        DogClass dog2 = new DogClass("大黑", 85);
        DogClass dog3 = new DogClass("旺财", 80);
        DogClass dog4 = new DogClass("狗蛋", 80);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(dog1);
        System.out.println(list);
    }

}
