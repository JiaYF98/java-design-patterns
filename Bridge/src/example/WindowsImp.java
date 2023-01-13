package example;

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在 Windows 系统中显示图像：");
    }
}
