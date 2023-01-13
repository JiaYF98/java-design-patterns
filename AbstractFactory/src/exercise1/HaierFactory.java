package exercise1;

public class HaierFactory implements AbstractFactory {
    @Override
    public TV productTV() {
        System.out.println("海尔电视生产成功");
        return new HaierTV();
    }

    @Override
    public AirConditioning productAirConditioning() {
        System.out.println("海尔空调生产成功");
        return new HaierAirConditioning();
    }
}
