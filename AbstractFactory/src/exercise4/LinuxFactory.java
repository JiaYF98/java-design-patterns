package exercise4;

public class LinuxFactory implements SystemFactory {
    @Override
    public Button createButton() {
        System.out.println("Linux 按钮创建成功");
        return new LinuxButton();
    }

    @Override
    public Text createText() {
        System.out.println("Linux 文本创建成功");
        return new LinuxText();
    }
}
