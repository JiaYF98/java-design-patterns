package example;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private String name;
    private final ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile) fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("*****对文件夹'" + name + "'进行杀毒");

        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
