package exercise2;

public class Fighter extends AirCraft {
    public Fighter(FlyBehavior flyBehavior, TakeOffBehavior takeOffBehavior) {
        super(flyBehavior, takeOffBehavior);
    }

    @Override
    public void fly() {
        System.out.println("歼击机飞行特征");
        flyBehavior.fly();
    }

    @Override
    public void takeOff() {
        System.out.println("歼击机起飞特征");
        takeOffBehavior.takeOff();
    }
}
