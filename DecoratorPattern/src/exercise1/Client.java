package exercise1;

public class Client {
    public static void main(String[] args) {
        Cellphone cellphone, cellphone1;
        cellphone = new SimplePhone();
        cellphone1 = new ComplexPhone(cellphone);
        cellphone1.receiveCall();
    }
}
