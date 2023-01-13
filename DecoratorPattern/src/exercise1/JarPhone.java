package exercise1;

public class JarPhone extends PhoneDecorator {
    public JarPhone(Cellphone cellphone) {
        super(cellphone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("手机振动");
    }
}
