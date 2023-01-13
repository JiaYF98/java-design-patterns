package exercise2;

public class MediaPlayerWindow  implements MainWindow {
    private final MediaPlayerAPI mapi = new MediaPlayerAPI();

    @Override
    public void show() {
        mapi.showWindow();
    }
}
