package exercise2;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle 连接成功");
    }
}
