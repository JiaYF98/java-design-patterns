package exercise1;

import java.util.ArrayList;

public class RemoteControl implements AbstractRemoteControl {
    private int cursor;
    private final ArrayList<Channel> channels;

    public RemoteControl(AbstractTV tv) {
        channels = tv.getChannels();
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < channels.size();
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        if (cursor < channels.size())
            cursor++;
    }

    @Override
    public Object currentChannel() {
        return channels.get(cursor);
    }
}
