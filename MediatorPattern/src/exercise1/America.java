package exercise1;

public class America extends Country {
    public America(UnitedNations unitedNations) {
        super(unitedNations);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("美国接收到消息：" + message);
    }
}
