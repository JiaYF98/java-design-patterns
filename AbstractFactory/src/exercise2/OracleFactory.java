package exercise2;

public class OracleFactory implements DatabaseFactory {
    @Override
    public Connection getConnection() {
        System.out.println("创建 Oracle 连接语句成功");
        return new OracleConnection();
    }

    @Override
    public Statement getStatement() {
        System.out.println("创建 Oracle 声明语句成功");
        return new OracleStatement();
    }
}
