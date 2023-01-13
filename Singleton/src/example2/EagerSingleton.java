package example2;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private String type;    //没有其它变量或方法时，上局会标黄
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
