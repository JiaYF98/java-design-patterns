package exercise2;

public class AirPlane extends AirCraft {
    public AirPlane(FlyBehavior flyBehavior, TakeOffBehavior takeOffBehavior) {
        super(flyBehavior, takeOffBehavior);
    }

    @Override
    public void fly() {
        System.out.println("客机飞行特征");
        flyBehavior.fly();
    }

    @Override
    public void takeOff() {
        System.out.println("客机起飞特征");
        takeOffBehavior.takeOff();
    }
}
