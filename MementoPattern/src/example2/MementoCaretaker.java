package example2;
import example.*;

import java.util.ArrayList;

public class MementoCaretaker {
    private ArrayList<ChessmanMemento> mementoList = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementoList.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
