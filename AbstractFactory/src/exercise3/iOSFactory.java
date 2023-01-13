package exercise3;

public class iOSFactory implements SystemFactory {
    @Override
    public OperationController getOperationController() {
        System.out.println("iOS 操作控制器创建成功");
        return new iOSOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        System.out.println("iOS 用户界面控制器创建成功");
        return new iOSInterfaceController();
    }
}
