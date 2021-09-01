package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/27 10:12
 * Description:
 * -
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //用迭代器打印出列表中的元素
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //用增强for循环印出列表中的元素
        for(Object i : list){
            System.out.println(i);
        }
    }
}
