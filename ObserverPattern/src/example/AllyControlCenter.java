package example;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    protected String allName;
    protected ArrayList<Observer> players = new ArrayList<>();

    public void setAllName(String allyName) {
        this.allName = allyName;
    }

    public String getAllName() {
        return this.allName;
    }

    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allName + "战队！");
        players.add(observer);
    }

    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allName + "战队");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);
}
