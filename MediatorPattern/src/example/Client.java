package example;

public class Client {
    public static void main(String[] args) {
        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        Button addButton = new Button(mediator);
        List list = new List(mediator);
        ComboBox comboBox = new ComboBox(mediator);
        TextBox textBox = new TextBox(mediator);

        mediator.setAddButton(addButton);
        mediator.setList(list);
        mediator.setComboBox(comboBox);
        mediator.setUserNameTextBox(textBox);

        addButton.changed("用户1");
        System.out.println("--------------------------");
        list.changed("用户2");
    }
}
