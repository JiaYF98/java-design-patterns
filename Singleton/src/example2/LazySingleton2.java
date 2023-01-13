package example2;

public class LazySingleton2 {
    private volatile static LazySingleton2 instance;

    private LazySingleton2() {

    }

    public static LazySingleton2 getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton2.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}
