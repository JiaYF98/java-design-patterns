package exercise2;

import java.util.ArrayList;

public abstract class AbstractAggregate {
    private final ArrayList<Object> list = new ArrayList<>();

    public ArrayList<Object> getList() {
        return list;
    }

    public void addItem(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public abstract Iterator createIterator();
}
