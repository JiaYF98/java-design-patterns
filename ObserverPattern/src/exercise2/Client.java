package exercise2;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Subject department = new Department("软件工程");

        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(new Teacher("教师1", department));
        observers.add(new Teacher("教师2", department));
        observers.add(new Student("学生1", department));
        observers.add(new Student("学生2", department));
        observers.add(new Student("学生3", department));
        observers.add(new Student("学生4", department));

        for (Observer observer : observers) {
            System.out.println(observer);
        }

        System.out.println("***************************");

        department.changeDepartmentName("计算机科学与技术");

        for (Observer observer : observers) {
            System.out.println(observer);
        }
    }
}
