package example;

public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.print(fileName + "，格式为 BMP.");
    }
}
