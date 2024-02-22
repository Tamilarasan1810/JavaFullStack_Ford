package CollectionsFrameWork.CollectionDemo;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("apple");
        list.add(222.22);
        list.add(true);
        list.add('A');
        list.remove(Integer.valueOf(100));
        System.out.println(list);
    }
}
