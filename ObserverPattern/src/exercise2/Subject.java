package exercise2;

public interface Subject {
    String getDepartmentName();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void changeDepartmentName(String name);
}
