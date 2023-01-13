package example2;

public class OffState extends SwitchState {
    @Override
    public void off(Switch aSwitch) {
        System.out.println("已经关闭！");
    }

    @Override
    public void on(Switch aSwitch) {
        System.out.println("打开！");
        aSwitch.setState(Switch.getState("on"));
    }
}
