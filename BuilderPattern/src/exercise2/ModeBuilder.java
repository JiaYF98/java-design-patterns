package exercise2;

public abstract class ModeBuilder {
    protected Player player = new Player();

    public abstract void buildType();

    public abstract void buildMenu();

    public abstract void buildPlaylist();

    public abstract void buildMainWindow();

    public abstract void buildControlBar();

    public abstract void buildFavoritesList();

    public Player construct() {
        return player;
    }

    public Boolean isMenu() {
        return false;
    }

    public Boolean isPlaylist() {
        return false;
    }

    public Boolean isFavoritesList() {
        return false;
    }

}
