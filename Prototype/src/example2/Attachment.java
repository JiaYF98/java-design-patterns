package example2;

import java.io.Serializable;

public class Attachment implements Serializable {   //实现序列化的对象要实现 Serializable 接口
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
