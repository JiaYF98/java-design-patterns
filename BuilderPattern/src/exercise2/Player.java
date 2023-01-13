package exercise2;

public class Player {
    private String type;
    private String menu;
    private String playlist;
    private String mainWindow;
    private String controlBar;
    private String favoritesList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMenu() {
        return menu == null ? "无菜单" : menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlaylist() {
        return playlist == null ? "无播放列表" : playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getFavoritesList() {
        return favoritesList == null ? "无收藏列表" : favoritesList;
    }

    public void setFavoritesList(String favoritesList) {
        this.favoritesList = favoritesList;
    }
}
