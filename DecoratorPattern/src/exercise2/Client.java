package exercise2;

public class Client {
    public static void main(String[] args) {
        Beverage beverage, beverage1, beverage2;
        beverage = new Espresso();
        System.out.println(beverage.getDescription() + " ￥" + beverage.getCost());
        beverage1 = new Mocha(beverage);
        System.out.println(beverage1.getDescription() + " ￥" + beverage1.getCost());
        beverage2 = new Milk(beverage1);
        System.out.println(beverage2.getDescription() + " ￥" + beverage2.getCost());
    }
}
