package task.collection;
// TODO: Создание списка студентов:
//  Создайте класс Student с полями name и age.
//  Создайте метод, который будет принимать список студентов и выводить их на экран.
//  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.


import java.util.ArrayList;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Akim", 28);
        Student st2 = new Student("Dasha", 18);
        Student st3 = new Student("Alena", 22);
        Student st4 = new Student("Sabina", 25);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        System.out.println(list);
        Student.getAge(list);

    }

    public static void getAge(ArrayList<Student> list) {
        for (Student st : list) {
            if (st.age > 20) {
                System.out.println(st);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}