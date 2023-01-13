package exercise1;

public class Client {
    public static void main(String[] args) {
        AbstractTV tv = new TV();

        for (int i = 0; i < 10; i++) {
            tv.addChannel(new Channel(i + 1, "频道" + (i + 1)));
        }

        AbstractRemoteControl remoteControl  = tv.createRemoteControl();
        while(remoteControl.hasNext()) {
            System.out.println(remoteControl.currentChannel().toString());
            remoteControl.next();
        }
    }
}
