package example;

public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("FacadePattern//src//example//src.txt", "FacadePattern//src//example//des.txt");
    }
}
