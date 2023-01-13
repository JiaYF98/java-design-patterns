package example;

import java.util.Arrays;

public class List extends Component {
    public List(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update(String name) {
        System.out.println("列表框增加一项：" + name);
    }

    public void select(String name) {
        System.out.println("列表框选中项：" + name);
    }
}
