package example;

public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = (SkinFactory) XMLUtil.getBean();
        if (skinFactory != null) {
            Button button = skinFactory.createButton();
            button.display();
            TextField textField = skinFactory.createTextField();
            textField.display();
            ComboBox comboBox = skinFactory.createComBox();
            comboBox.display();
        }
    }
}
