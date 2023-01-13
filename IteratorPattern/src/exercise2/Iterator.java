package exercise2;

import java.util.List;

public interface Iterator {
    void first();
    boolean hasNext();
    void next();
    List<Object> currentItem();
}
