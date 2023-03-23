//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Scanner;

public class hw_4_task2 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("1");
        llist.add("2");
        llist.add("3");
        llist.add("4");
        llist.add("5");
        llist.add("6");
        llist.add("7");
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите элемент для добавления в список: ");
        String uselem = iScanner.nextLine();
        System.out.println("Поместили новый элемент в конец очереди: " + enqueue(llist, uselem));
        System.out.println("Удаляем первый элемент списка из очереди: " + dequeue(llist));
        System.out.println("Возвращаем первый элемент списка и не удаляем его: " + first(llist));
        iScanner.close();
    }


    // enqueue()
    public static LinkedList<String> enqueue(LinkedList<String> list, String element) {
        list.add(element);
        return list;
    }
    // dequeue()
    public static LinkedList<String> dequeue(LinkedList<String> list) {
        if (list.size() < 2) {
            System.out.println("Первый элемент отсутствует!");
        } else {
            System.out.println("Возвращаем первый элемент списка: " + list.get(0));
            list.remove(0);
        }
        return list;
    }
    // first()
    public static String first(LinkedList<String> list) {
        return list.get(0);
    }
}
