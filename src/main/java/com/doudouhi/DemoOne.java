package com.doudouhi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
public class DemoOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //顺序不能乱
        list.add(0,"minutes");
        list.add(1,"second");
        list.add(2,"commit");
        list.add(3,"doudouhi");
        list.add(4,"string");
        list.add(5,"admin");
        list.add(6,"class");
        list.add(7,"8888");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
