package example;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在 Unix 系统中显示图像：");
    }
}
