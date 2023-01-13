package exercise4;

public class WindowsFactory implements SystemFactory{
    @Override
    public Button createButton() {
        System.out.println("Windows 按钮创建成功");
        return new WindowsButton();
    }

    @Override
    public Text createText() {
        System.out.println("Windows 文本创建成功");
        return new WindowsText();
    }
}
