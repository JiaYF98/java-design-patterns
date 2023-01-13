package exercise2;

public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("MySQL 连接成功");
    }
}
