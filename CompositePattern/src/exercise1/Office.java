package exercise1;

public class Office extends Unit {
    private String name;

    public Office(String name) {
        this.name = name;
    }

    @Override
    public void handleArchives() {
        System.out.println("处理" + name + "办公室档案");
    }
}
