package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("读取文件，获取明文：");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream inputStream = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inputStream.read()) != -1) {
                sb.append((char) data);
            }
            inputStream.close();
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
        return sb.toString();
    }
}
