package exercise2;

public class Client {
    public static void main(String[] args) {
        AirCraft airCraft = new Harrier(new SuperSonicFly(), new VerticalTakeOff());
        airCraft.takeOff();
        airCraft.fly();
    }
}
