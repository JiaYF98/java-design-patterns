package example2;

public class Client {
    public static void main(String[] args) {
        AbstractEncryptFacade ef;
        ef = (AbstractEncryptFacade) XMLUtil.getBean();
        if (ef != null) {
            ef.fileEncrypt("FacadePattern//src//example2//src.txt", "FacadePattern//src//example2//des.txt");
        }
    }
}
