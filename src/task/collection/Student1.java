package task.collection;

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость..

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1 {
    String name;
    int attendance;

    public Student1(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Dasha", 15);
        Student1 st2 = new Student1("Akim", 50);
        Student1 st3 = new Student1("Alena", 23);
        Student1 st4 = new Student1("Sabina", 45);
        Student1 st5 = new Student1("Zaur", 64);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Student1.minAttendance(list);
        Student1.averageAttendance(list);

    }

    public static void minAttendance(ArrayList<Student1> list) {
        List<Integer> list1 = new ArrayList<>();
        for (Student1 st : list) {
            list1.add(st.attendance);
        }
        int min = Collections.min(list1);
        for (Student1 st : list) {
            if (min == st.attendance) {
                System.out.println(st);
            }
        }
    }

    public static void averageAttendance(ArrayList<Student1> list) {
        double counter = 0;
        double summ = 0;
        for (Student1 st : list) {
            summ += st.attendance;
            ;
            counter++;
        }
        System.out.println(summ / counter);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}