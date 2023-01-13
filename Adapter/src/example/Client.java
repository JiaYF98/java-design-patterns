package example;

public class Client {
    public static void main(String[] args) {
        CarController car;
        car = (CarController) XMLUtil.getBean();
        if (car != null) {
            car.move();
            car.phonate();
            car.twinkle();
        }
    }
}
