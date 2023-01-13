package exercise2;

public abstract class AirCraft {
    protected FlyBehavior flyBehavior;
    protected TakeOffBehavior takeOffBehavior;

    public AirCraft(FlyBehavior flyBehavior, TakeOffBehavior takeOffBehavior) {
        this.flyBehavior = flyBehavior;
        this.takeOffBehavior = takeOffBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setTakeOffBehavior(TakeOffBehavior takeOffBehavior) {
        this.takeOffBehavior = takeOffBehavior;
    }

    public abstract void fly();
    public abstract void takeOff();
}
