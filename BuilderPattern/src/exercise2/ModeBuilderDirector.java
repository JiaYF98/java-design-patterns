package exercise2;

public class ModeBuilderDirector {
    public Player construct(ModeBuilder modeBuilder) {
        modeBuilder.buildType();
        if (modeBuilder.isMenu()) {
            modeBuilder.buildMenu();
        }
        if (modeBuilder.isPlaylist()) {
            modeBuilder.buildPlaylist();
        }
        modeBuilder.buildMainWindow();
        modeBuilder.buildControlBar();
        if (modeBuilder.isFavoritesList()) {
            modeBuilder.buildFavoritesList();
        }
        return modeBuilder.construct();
    }
}
