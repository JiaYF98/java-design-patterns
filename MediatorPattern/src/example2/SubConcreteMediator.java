package example2;
import example.*;

public class SubConcreteMediator extends ConcreteMediator {
    private Label label;

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public void componentChanged(Component c, String name) {
        if (c == super.getAddButton()) {
            System.out.println("--单击增加按钮--");
            super.getList().update(name);
            super.getComboBox().update(name);
            super.getUserNameTextBox().update(name);
            label.update(name);
        } else if (c == super.getList()) {
            System.out.println("--从列表框选择客户--");
            super.getComboBox().select(name);
            super.getUserNameTextBox().setText(name);
        } else if (c == super.getComboBox()) {
            System.out.println("--从组合框选择客户--");
            super.getComboBox().select(name);
            super.getUserNameTextBox().setText(name);
        }
    }
}
