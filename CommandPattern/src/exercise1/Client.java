package exercise1;

public class Client {
    public static void main(String[] args) {
        BoardScreen screen = new BoardScreen();
        Menu menu = screen.getMenu();
        Command openCommand, createCommand, editCommand;
        openCommand = new OpenCommand();
        createCommand = new CreateCommand();
        editCommand = new EditCommand();
        MenuItem openItem, createItem, editItem;
        openItem = menu.getMenuItem("打开");
        createItem = menu.getMenuItem("新建");
        editItem = menu.getMenuItem("编辑");
        openItem.setCommand(openCommand);
        createItem.setCommand(createCommand);
        editItem.setCommand(editCommand);
        screen.display();
        openItem.click();
        createItem.click();
        editItem.click();
    }
}
