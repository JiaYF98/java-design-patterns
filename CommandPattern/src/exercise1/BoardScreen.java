package exercise1;

import java.util.Iterator;

public class BoardScreen {
    private final Menu menu = new Menu();

    public BoardScreen() {
        MenuItem openItem = new MenuItem("打开");
        MenuItem createItem = new MenuItem("新建");
        MenuItem editItem = new MenuItem("编辑");
        menu.addMenuItem(openItem);
        menu.addMenuItem(createItem);
        menu.addMenuItem(editItem);
    }

    public Menu getMenu() {
        return menu;
    }

    public void edit() {
        System.out.println("显示编辑窗口！");
    }

    public void create() {
        System.out.println("显示创建窗口！");
    }

    public void open() {
        System.out.println("显示打开窗口！");
    }

    public void display() {
        System.out.println("主菜单选项：");
        Iterator<MenuItem> iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
