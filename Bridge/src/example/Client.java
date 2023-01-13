package example;

public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image) XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");
        if (image != null) {
            image.setImp(imp);
            image.parseFile("图片1");
        }
    }
}
