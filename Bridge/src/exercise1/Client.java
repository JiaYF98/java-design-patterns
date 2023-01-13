package exercise1;

public class Client {
    public static void main(String[] args) {
        DataHandler handler = new OracleHandler();
        FileConvertor fileConvertor = new TXTConvertor();
        fileConvertor.setHandler(handler);
        fileConvertor.convertData();
    }
}
