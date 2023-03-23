// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;

public class hw_4_task1 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("1");
        llist.add("2");
        llist.add("3");
        llist.add("4");
        llist.add("5");
        llist.add("6");
        llist.add("7");
        System.out.println("Изначальный список: " + llist);
        System.out.println("Перевернули список: " + reverseLL(llist));
    }
    public static LinkedList<String> reverseLL(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<>();
        for (String i : list) {
            result.addFirst(i);
        }
        return result;
    }
}
