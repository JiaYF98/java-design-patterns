package example;

public class FunctionButton {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        System.out.println("单击功能键：");
        command.execute();
    }
}
