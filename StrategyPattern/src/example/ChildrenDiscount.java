package example;

public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        double DISCOUNT = 10;
        if (price >= 20)
            return price - DISCOUNT;
        else return price;
    }
}
