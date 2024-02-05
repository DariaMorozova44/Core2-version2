package task.collection;
// TODO: Управление задачами:
//  Создайте класс Task с полями id, title и completed.
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

import java.util.ArrayList;

public class Task {
    int id;
    String title;
    boolean completed;

    Task(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;

    }

    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();
        Task t1 = new Task(1, "task2", true);
        Task t2 = new Task(2, "task1", false);
        Task t3 = new Task(3, "task1", false);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        Task.completed(list);
        Task.getNameTask(list);
    }

    public static void completed(ArrayList<Task> list) {
        for (Task t : list) {
            if (!t.completed) {
                System.out.println(t);
            }
        }
    }

    public static void getNameTask(ArrayList<Task> list) {
        for (Task t : list) {
            if (t.title.equals("task1")) {
                System.out.println(t);
            }
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}