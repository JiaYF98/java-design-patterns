package example;

import java.util.Arrays;

public class ComboBox extends Component {
    public ComboBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update(String name) {
        System.out.println("组合框增加一项：" + name);
    }

    public void select(String name) {
        System.out.println("组合框选中项：" + name);
    }
}
