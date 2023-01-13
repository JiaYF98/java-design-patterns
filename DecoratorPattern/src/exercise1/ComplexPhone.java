package exercise1;

public class ComplexPhone extends PhoneDecorator{
    public ComplexPhone(Cellphone cellphone) {
        super(cellphone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("手机振动");
        System.out.println("灯光闪烁");
    }
}
