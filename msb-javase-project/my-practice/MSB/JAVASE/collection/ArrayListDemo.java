package collection;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/26 16:12
 * Description:
 * - collection
 */

import javafx.print.Collation;

import java.util.*;

/**
 * Collection 是接口，下辖 List 和 set 也是接口。
 * List下辖 ArrayList 和 LinkedList
 * Set 下辖 HashSet 和 TreeSet
 *
 * Collection 接口存储一组不唯一，无序的对象
 * ▪ List 接口存储一组不唯一， 有序（插入顺序）的对象
 * ▪ Set 接口存储一组唯一， 无序的对象
 * ▪ Map接口存储一组键值对象，提供key到value的映射
 *
 * Collection接口的常用方法：
 * 集合作为容器应该具有的功能（增，删，改，查）
 * 集合的基本操作：增加，删除，判断，取出
 */

public class ArrayListDemo {

    public static void main(String[] args) {
        //Collation collation = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        System.out.println(arrayList);
        List list = Arrays.asList(1,2,3,4,5);
        arrayList.addAll(   list);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(2));

        // 遍历ArrayList的方法一
        System.out.println("遍历ArrayList的方法一：");
        for(int i=0;i<list.size();i++){
            //System.out.println(list.get(i));
            System.out.println(arrayList.get(i));
        }

        // 遍历ArrayList的方法二
        System.out.println("遍历ArrayList的方法二");
        Iterator it1 = arrayList.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }

}
