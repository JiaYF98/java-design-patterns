package exercise2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    private final ArrayList<Object> list;
    private int cursor;
    private int span;

    public ConcreteIterator(AbstractAggregate aggregate) {
        list = aggregate.getList();
        cursor = 0;
        span = 1;
    }

    public void setSpan(int span) {
        if (span <= 0) {
            System.out.println("间距不能小于1！\n默认间距为1");
        } else {
            this.span = span;
        }
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public void next() {
        cursor += span;
    }

    @Override
    public List<Object> currentItem() {
        return list.subList(cursor, Math.min(cursor + span, list.size()));
    }
}
