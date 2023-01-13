package exercise4;

public class Client {
    public static void main(String[] args) {
        SystemFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.show();
        Text text = factory.createText();
        text.show();
    }
}
