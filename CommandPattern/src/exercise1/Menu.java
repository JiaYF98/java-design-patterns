package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    private final ArrayList<MenuItem> itemArrayList = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        itemArrayList.add(item);
    }

    public Iterator<MenuItem> getIterator() {
        return itemArrayList.iterator();
    }

    public MenuItem getMenuItem(String name) {
        for (MenuItem item : itemArrayList) {
            if (name.equalsIgnoreCase(item.getName()))
                return item;
        }
        return null;
    }
}
