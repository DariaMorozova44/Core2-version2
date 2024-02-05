package task.collection;
// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.


import java.util.ArrayList;

public class Order {
    int id;
    String customer;
    int totalAmount;

    Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;

    }

    public static void main(String[] args) {
        Order o1 = new Order(1, "Dasha", 666);
        Order o2 = new Order(2, "Akim", 1000);
        Order o3 = new Order(1, "Alena", 1500);
        ArrayList<Order> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        Order.sum(list);
        Order.maxSum(list);
    }

    public static void maxSum(ArrayList<Order> list) {
        int counter = 0;
        for (Order o : list) {
            if (o.totalAmount > counter) {
                counter = o.totalAmount;
            }
        }
        for (Order o : list) {
            if (counter == o.totalAmount) {
                System.out.println(o);
            }
        }

    }

    public static void sum(ArrayList<Order> list) {
        int sum = 0;
        for (Order o : list) {
            sum += o.totalAmount;
        }
        System.out.println(sum);

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}