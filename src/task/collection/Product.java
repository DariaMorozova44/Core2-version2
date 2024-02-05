package task.collection;

// TODO: Учет товаров на складе:
//  Создайте класс Product с полями id, name и quantity.
//  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
//  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

import java.util.ArrayList;

public class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Product p1 = new Product(1, "product1", 555);
        Product p2 = new Product(2, "product2", 1256);
        Product p3 = new Product(3, "product3", 51);
        Product p4 = new Product(4, "product4", 0);
        Product p5 = new Product(5, "product5", 0);
        Product p6 = new Product(6, "product1", 18);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        Product.nullQuantity(list);
        Product.sumQuantity(list);
    }

    public static void nullQuantity(ArrayList<Product> list) {
        for (Product p : list) {
            if (p.quantity == 0) {
                System.out.println(p);
            }

        }

    }

    public static void sumQuantity(ArrayList<Product> list) {
        int sum = 0;
        for (Product p : list) {
            sum += p.quantity;
        }
        System.out.println(sum);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
