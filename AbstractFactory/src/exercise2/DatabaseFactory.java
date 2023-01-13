package exercise2;

public interface DatabaseFactory {
    public Connection getConnection();
    public Statement getStatement();
}
