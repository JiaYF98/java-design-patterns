package exercise2;

public class ConcreteAggregate extends AbstractAggregate {

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
