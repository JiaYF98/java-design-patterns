package exercise1;

public class XMLConvertor extends FileConvertor {
    @Override
    public void convertData() {
        handler.readData();
        System.out.println("将数据转换为 xml 格式");
    }
}
