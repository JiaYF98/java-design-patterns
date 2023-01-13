package example;

public class EncryptFacade {
    private final FileReader reader;
    private final CipherMachine cipherMachine;
    private final FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipherMachine = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
