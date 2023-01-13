package exercise1;

public class DataOperation {
    private Cipher cipher;

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }

    public String doEncrypt(int key, String painText) {
        return cipher.doEncrypt(key, painText);
    }
}
