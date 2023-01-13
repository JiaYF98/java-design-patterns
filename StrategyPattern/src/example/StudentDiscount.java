package example;

public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        double DISCOUNT = 0.8;
        return price * DISCOUNT;
    }
}
