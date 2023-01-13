package exercise4;

public class UnixFactory implements SystemFactory {
    @Override
    public Button createButton() {
        System.out.println("Unix 按钮创建成功");
        return new UnixButton();
    }

    @Override
    public Text createText() {
        System.out.println("Unix 文本创建成功");
        return new UnixText();
    }
}
