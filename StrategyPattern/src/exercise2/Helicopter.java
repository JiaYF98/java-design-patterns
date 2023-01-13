package exercise2;

public class Helicopter extends AirCraft {
    public Helicopter(FlyBehavior flyBehavior, TakeOffBehavior takeOffBehavior) {
        super(flyBehavior, takeOffBehavior);
    }

    @Override
    public void fly() {
        System.out.println("直升机飞行特征");
        flyBehavior.fly();
    }

    @Override
    public void takeOff() {
        System.out.println("直升机起飞特征");
        takeOffBehavior.takeOff();
    }
}
