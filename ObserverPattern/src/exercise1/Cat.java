package exercise1;

import java.util.ArrayList;

public class Cat implements Subject {

    private ArrayList<Observer> list;

    public Cat() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer obs) {
        list.add(obs);
    }

    @Override
    public void cry() {
        for(Observer obs : list) {
            obs.response();
        }
    }
}
