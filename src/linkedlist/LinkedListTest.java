package linkedlist;

import java.util.LinkedList;

/**
 * @author levi
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);
        list.add(1);
        int i = list.indexOf(1);

        System.out.println(i);
    }
}
