package example;

public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在 Linux 系统中显示图像：");
    }
}
