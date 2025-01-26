package collections;

import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        // Notes
        // Array List Can grow and shrink as element are added or removed.
        // ArrayList, It has an initial capacity (default 10)
        // ArrayList will create a new array with larger capacity (usually 1.5 time of current capacity)
        // Time Complexity: 0(n)

        ArrayList<Integer> newList = new ArrayList();
        // List<Integer> new2List = new ArrayList();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);

        System.out.println(newList.size());

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        System.out.println(newList.contains(2));

        // newList.remove(2);
        newList.add(2,50);
        newList.set(1,10);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
};