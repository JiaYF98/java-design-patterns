package exercise2;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 奶泡";
    }

    @Override
    public int getCost() {
        return super.getCost() + 8;
    }
}
