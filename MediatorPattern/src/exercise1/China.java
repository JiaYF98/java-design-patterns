package exercise1;

public class China extends Country {
    public China(UnitedNations unitedNations) {
        super(unitedNations);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("中国接受到消息：" + message);
    }
}
