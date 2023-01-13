package exercise1;

public class TV extends AbstractTV {
    @Override
    public AbstractRemoteControl createRemoteControl() {
        return new RemoteControl(this);
    }
}
