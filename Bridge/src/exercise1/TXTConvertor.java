package exercise1;

public class TXTConvertor extends FileConvertor {
    @Override
    public void convertData() {
        handler.readData();
        System.out.println("将数据转换为 txt 格式");
    }
}
