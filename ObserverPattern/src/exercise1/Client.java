package exercise1;

public class Client {
    public static void main(String[] args) {
        Subject cat = new Cat();
        Observer mouse1, mouse2, master;
        mouse1 = new Mouse("大老鼠", cat);
        mouse2 = new Mouse("小老鼠", cat);
        master = new Master("主人", cat);
        cat.cry();
    }
}
