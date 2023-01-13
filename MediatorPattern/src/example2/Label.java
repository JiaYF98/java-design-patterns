package example2;

import example.Component;
import example.Mediator;

public class Label extends Component {
    public Label(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update(String name) {
        System.out.println("文本标签内容改变，客户信息总数加1");
    }
}
