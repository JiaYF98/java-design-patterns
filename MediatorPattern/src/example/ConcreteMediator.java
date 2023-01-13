package example;

public class ConcreteMediator extends Mediator {
    private Button addButton;
    private List list;
    private TextBox userNameTextBox;
    private ComboBox comboBox;

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public TextBox getUserNameTextBox() {
        return userNameTextBox;
    }

    public void setUserNameTextBox(TextBox userNameTextBox) {
        this.userNameTextBox = userNameTextBox;
    }

    public ComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(ComboBox comboBox) {
        this.comboBox = comboBox;
    }

    @Override
    public void componentChanged(Component c, String name) {
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update(name);
            comboBox.update(name);
            userNameTextBox.update(name);
        } else if (c == list) {
            System.out.println("--从列表框选择客户--");
            comboBox.select(name);
            userNameTextBox.setText(name);
        } else if (c == comboBox) {
            System.out.println("--从组合框选择客户--");
            comboBox.select(name);
            userNameTextBox.setText(name);
        }
    }
}
