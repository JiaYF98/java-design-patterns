package exercise1;

import java.util.ArrayList;

public class Institution extends Unit {
    private String name;
    private final ArrayList<Unit> list = new ArrayList<>();

    public Institution(String name) {
        this.name = name;
    }

    public void add(Unit unit) {
        list.add(unit);
    }

    public void remove(Unit unit) {
        list.remove(unit);
    }

    @Override
    public void handleArchives() {
        System.out.println("处理" + name + "档案");
        for (Unit unit : list) {
            unit.handleArchives();
        }
    }
}
