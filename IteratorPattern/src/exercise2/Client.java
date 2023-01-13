package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AbstractAggregate aggregate = new ConcreteAggregate();
        for (int i = 0; i < 100; i++) {
            aggregate.addItem("数据" + (i + 1));
        }

        ConcreteIterator iterator = (ConcreteIterator) aggregate.createIterator();
        iterator.setSpan(10);

        List<List<Object>> list = new ArrayList<>();

        while (iterator.hasNext()) {
//            list.add(iterator.currentItem());
            System.out.println(iterator.currentItem());
            iterator.next();
        }

//        for (List<Object> ls: list) {
//            System.out.println(ls);
//        }
    }
}
