package exercise1;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new HaierFactory();
        TV tv = factory.productTV();
        AirConditioning airConditioning = factory.productAirConditioning();
        tv.show();
        airConditioning.refrigerating();
        airConditioning.heating();
    }
}
