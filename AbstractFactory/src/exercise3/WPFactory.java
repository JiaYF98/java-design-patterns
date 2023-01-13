package exercise3;

public class WPFactory implements SystemFactory {
    @Override
    public OperationController getOperationController() {
        System.out.println("WindowsPhone 操作控制器创建成功");
        return new WPOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        System.out.println("WindowsPhone 用户界面控制器创建成功");
        return new AndroidInterfaceController();
    }
}
