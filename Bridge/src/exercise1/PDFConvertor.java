package exercise1;

public class PDFConvertor extends FileConvertor {
    @Override
    public void convertData() {
        handler.readData();
        System.out.println("将数据转换为 PDF 格式");
    }
}
