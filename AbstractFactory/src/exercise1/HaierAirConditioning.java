package exercise1;

public class HaierAirConditioning implements AirConditioning {
    @Override
    public void refrigerating() {
        System.out.println("海尔空调制冷");
    }

    @Override
    public void heating() {
        System.out.println("海尔空调制暖");
    }
}
