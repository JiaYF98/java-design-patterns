package exercise1;

import java.util.ArrayList;

public abstract class AbstractTV {
    private final ArrayList<Channel> channels = new ArrayList<>();

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    public abstract AbstractRemoteControl createRemoteControl();
}
