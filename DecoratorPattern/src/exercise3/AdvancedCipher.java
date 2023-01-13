package exercise3;

public class AdvancedCipher extends CipherDecorator {
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        return super.encrypt(plainText) + "进行求模加密";
    }
}
