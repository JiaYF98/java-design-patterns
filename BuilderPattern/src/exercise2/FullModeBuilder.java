package exercise2;

public class FullModeBuilder extends ModeBuilder {
    @Override
    public void buildType() {
        player.setType("完整模式");
    }

    @Override
    public void buildMenu() {
        player.setMenu("显示菜单");
    }

    @Override
    public void buildPlaylist() {
        player.setPlaylist("显示播放列表");
    }

    @Override
    public void buildMainWindow() {
        player.setMainWindow("显示主窗口");
    }

    @Override
    public void buildControlBar() {
        player.setControlBar("显示控制条");
    }

    @Override
    public void buildFavoritesList() {

    }

    @Override
    public Boolean isMenu() {
        return true;
    }

    @Override
    public Boolean isPlaylist() {
        return true;
    }
}
