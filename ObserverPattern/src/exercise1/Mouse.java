package exercise1;

public class Mouse implements Observer {
    private String name;

    public Mouse(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    @Override
    public void response() {
        System.out.println(this.name + "逃跑！");
    }
}
