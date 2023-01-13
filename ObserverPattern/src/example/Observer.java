package example;

public interface Observer {
    String getName();
    void setName(String name);
    void help();
    void beAttacked(AllyControlCenter acc);
}
