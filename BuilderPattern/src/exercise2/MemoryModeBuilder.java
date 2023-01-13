package exercise2;

public class MemoryModeBuilder extends ModeBuilder {
    @Override
    public void buildType() {
        player.setType("记忆模式");
    }

    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPlaylist() {

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
        player.setFavoritesList("显示收藏列表");
    }

    @Override
    public Boolean isFavoritesList() {
        return true;
    }
}
