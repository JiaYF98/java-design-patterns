package exercise1;

public class TCLAirConditioning implements AirConditioning {
    @Override
    public void refrigerating() {
        System.out.println("TCL空调制冷");
    }

    @Override
    public void heating() {
        System.out.println("TCL空调制暖");
    }
}
