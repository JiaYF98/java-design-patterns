package exercise2;

public class Harrier extends AirCraft {
    public Harrier(FlyBehavior flyBehavior, TakeOffBehavior takeOffBehavior) {
        super(flyBehavior, takeOffBehavior);
    }

    @Override
    public void fly() {
        System.out.println("鹞式战斗机飞行特征");
        flyBehavior.fly();
    }

    @Override
    public void takeOff() {
        System.out.println("鹞式战斗机起飞特征");
        takeOffBehavior.takeOff();
    }
}
