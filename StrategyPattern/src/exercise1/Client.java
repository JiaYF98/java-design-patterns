package exercise1;

public class Client {
    public static void main(String[] args) {
        DataOperation dataOperation = new DataOperation();
        Cipher cipher = new CaesarCipher();
        dataOperation.setCipher(cipher);
        dataOperation.doEncrypt(123, "df");
    }
}
