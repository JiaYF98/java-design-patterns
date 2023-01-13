package exercise2;

public class SRS implements OfficialDocument {
    @Override
    public void display() {
        System.out.println("SRS");
    }

    @Override
    public OfficialDocument clone() {
        try {
            return (OfficialDocument) super.clone();
        } catch (Exception e) {
            System.out.println("克隆 SRS 失败！");
            return null;
        }
    }
}
