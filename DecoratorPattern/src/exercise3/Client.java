package exercise3;

public class Client {
    public static void main(String[] args) {
        String plainText = "一段数据";
        Cipher cipher, cipher1, cipher2;
        cipher = new SimpleCipher();
        System.out.println(cipher.encrypt(plainText));
        cipher1 = new ComplexCipher(cipher);
        System.out.println(cipher1.encrypt(plainText));
        cipher2 = new AdvancedCipher(cipher1);
        System.out.println(cipher2.encrypt(plainText));
    }
}
