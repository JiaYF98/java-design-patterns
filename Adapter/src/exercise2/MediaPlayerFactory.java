package exercise2;

public class MediaPlayerFactory implements PlayerFactory {
    @Override
    public MainWindow createMainWindow() {
        System.out.println("创建 MediaPlayerMainWindow 成功！");
        return new MediaPlayerWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        System.out.println("创建 MediaPlayerPlayerList 成功！");
        return new MediaPlayerList();
    }
}
