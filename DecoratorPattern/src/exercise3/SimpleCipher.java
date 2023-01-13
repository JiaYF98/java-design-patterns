package exercise3;

public class SimpleCipher implements Cipher {
    @Override
    public String encrypt(String plainText) {
        return plainText + "进行简单加密";
    }
}
