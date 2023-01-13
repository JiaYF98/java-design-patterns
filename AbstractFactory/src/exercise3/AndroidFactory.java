package exercise3;

public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController getOperationController() {
        System.out.println("Android 操作控制器创建成功");
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        System.out.println("Android 用户界面控制器创建成功");
        return new AndroidInterfaceController();
    }
}
