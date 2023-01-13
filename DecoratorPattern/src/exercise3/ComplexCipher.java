package exercise3;

public class ComplexCipher extends CipherDecorator{
    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        return super.encrypt(plainText) + "进行逆向输出加密";
    }
}
