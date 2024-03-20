package org.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collections {

    public static void main(String[] args) {
        //用ArrayList 实现 collections method
        List list = new ArrayList<>();

        list.add("dsadas");
        list.add(12345);
        list.add(false);
        System.out.println("list:"+list);

        list.remove(1);
        System.out.println("list:"+list);
        System.out.println(list.contains("dsadas"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.removeAll(list);
        System.out.println("list:"+ list);
        ArrayList list2 = new ArrayList<>();
        list2.add("xiao");
        list2.add("q");
        list.addAll(list2);
        System.out.println("list2:"+list2);
        list2.removeAll(list2);
        System.out.println("list2:"+list2);
        Collection col = new ArrayList<>();

        col.add("dsadasd");
        col.add(true);
        col.add("jack");
        col.add(15244);
        Iterator iterator = col.iterator();

        iterator.hasNext();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object o : col) {
            System.out.println(o);
        }

    }
}
