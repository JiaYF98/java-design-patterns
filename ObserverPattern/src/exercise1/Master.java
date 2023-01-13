package exercise1;

public class Master implements Observer {
    private String name;

    public Master(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    @Override
    public void response() {
        System.out.println(this.name + "惊醒");
    }
}
