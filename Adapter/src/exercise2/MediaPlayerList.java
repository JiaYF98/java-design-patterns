package exercise2;

public class MediaPlayerList implements PlayerList {
    private final MediaPlayerAPI mapi = new MediaPlayerAPI();

    @Override
    public void showPlayerList() {
        mapi.showPlayerList();
    }
}
