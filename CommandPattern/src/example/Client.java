package example;

public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        fb.setCommand((Command) XMLUtil.getBean());
        fb.click();
    }
}
