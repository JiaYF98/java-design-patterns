package exercise2;

public class Client {
    public static void main(String[] args) {
        DatabaseFactory factory= new OracleFactory();
        Connection connection = factory.getConnection();
        Statement statement = factory.getStatement();
        connection.connect();
        statement.executeStatement();
    }
}
