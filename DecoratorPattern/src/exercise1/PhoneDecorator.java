package exercise1;

public class PhoneDecorator extends Cellphone {
    private Cellphone cellphone;

    public PhoneDecorator(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public void receiveCall() {
        cellphone.receiveCall();
    }
}
