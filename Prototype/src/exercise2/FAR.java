package exercise2;

public class FAR implements OfficialDocument {
    @Override
    public void display() {
        System.out.println("FAR");
    }

    @Override
    public OfficialDocument clone() {
        try {
            return (OfficialDocument) super.clone();
        } catch (Exception e) {
            System.out.println("克隆 FAR 失败！");
            return null;
        }
    }
}
