package example;

import java.util.Arrays;

public class TextBox extends Component {
    public TextBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update(String name) {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText(String name) {
        System.out.println("文本框显示：" + name);
    }
}
