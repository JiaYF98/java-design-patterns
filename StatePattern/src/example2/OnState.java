package example2;

public class OnState extends SwitchState {
    @Override
    public void off(Switch aSwitch) {
        System.out.println("关闭！");
        aSwitch.setState(Switch.getState("off"));
    }

    @Override
    public void on(Switch aSwitch) {
        System.out.println("已经打开！");
    }
}
