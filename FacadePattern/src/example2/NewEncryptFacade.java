package example2;

import example.FileReader;
import example.FileWriter;

public class NewEncryptFacade extends AbstractEncryptFacade {
    private final FileReader reader;
    private final NewCipherMachine cipherMachine;
    private final FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        cipherMachine = new NewCipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainText = reader.read(fileNameSrc);
        String encryptText = cipherMachine.encrypt(plainText);
        writer.write(encryptText, fileNameDes);
    }
}
