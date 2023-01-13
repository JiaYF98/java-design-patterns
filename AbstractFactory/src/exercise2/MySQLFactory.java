package exercise2;

public class MySQLFactory implements DatabaseFactory {
    @Override
    public Connection getConnection() {
        System.out.println("创建 MySQL 连接对象成功");
        return new MySQLConnection();
    }

    @Override
    public Statement getStatement() {
        System.out.println("创建 MySQL 语句对象成功");
        return new MySQLStatement();
    }
}
