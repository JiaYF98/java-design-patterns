package exercise2;

import java.util.ArrayList;

public class Department implements Subject {
    private final ArrayList<Observer> observers;
    private String departmentName;

    public Department(String name) {
        this.departmentName = name;
        observers = new ArrayList<>();
    }

    @Override
    public String getDepartmentName() {
        return this.departmentName;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void changeDepartmentName(String department) {
        this.departmentName = department;
        for (Observer obs : observers) {
            obs.setDepartment(departmentName);
        }
    }
}
