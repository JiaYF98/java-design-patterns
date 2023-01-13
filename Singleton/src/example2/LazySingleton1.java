package example2;

public class LazySingleton1 {
    private static LazySingleton1 instance;

    private LazySingleton1() {

    }

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton1.class) {
                instance = new LazySingleton1();
            }
        }
        return instance;
    }
}
