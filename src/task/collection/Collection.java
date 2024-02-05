package task.collection;

import java.util.*;


// Реализуйте функциональность согласно описанию

public class Collection {
    public static void main(String[] args) {
        // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(6);
        //System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(2);
        list2.add(53);
        list2.add(1);
        list2.add(90);
        list2.add(60);
        list2.add(3);
        list2.add(77);
        //System.out.println(list2)

        // Collection.removeElements(list);
        //Collection.reverseList(list);
        // Collection.intersection(list, list2);;

        HashMap<Integer, String> map = new HashMap<>();
        map.put(111, "dasha");
        map.put(222, "akim");
        map.put(333, "alena");
        map.put(444, "dasha");

        // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
        map.values().removeAll(Collections.singleton("dasha"));
        System.out.println(map);


        // TODO: Найти наибольший элемент в списке.

        System.out.println(Collections.max(list));


        // TODO: Проверить, содержит ли множество определенный элемент.
        System.out.println(list.contains(90));

        // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
        System.out.println(list.removeAll(list2));
        System.out.println(list);

        // TODO: Проверить, содержит ли карта определенный ключ.
        System.out.println(map.containsKey(222));

        // TODO: Получить все значения, связанные с определенным ключом.
        System.out.println(map.get(222));

        // TODO: Добавить элемент в очередь.
        Queue<String> queue = new LinkedList<>();
        queue.offer("Dasha");

        // TODO: Получить и удалить первый элемент из очереди.
        System.out.println(queue.element());
        //queue.remove();
        System.out.println(queue);


        // TODO: Проверить, пуста ли очередь.
        System.out.println(queue.isEmpty());


    }


    // TODO: Удалить все дубликаты из списка.
    public static void removeElements(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int l : list) {
            if (!list1.contains(l)) {
                list1.add(l);
            }
        }
        System.out.println(list1);
    }

    // TODO: Отсортировать список в порядке убывания.
    public static void reverseList(ArrayList<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }


    // TODO: Найти пересечение двух множеств.
    public static void intersection(ArrayList<Integer> list, ArrayList<Integer> list2) {
        for (int l : list) {
            if (list2.contains(l)) {
                System.out.print(l + " ");
            }
        }
        System.out.println();
    }


}