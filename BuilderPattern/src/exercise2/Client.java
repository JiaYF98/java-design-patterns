package exercise2;

public class Client {
    public static void main(String[] args) {
        ModeBuilder modeBuilder = new MemoryModeBuilder();
        ModeBuilderDirector director = new ModeBuilderDirector();
        Player player = director.construct(modeBuilder);
        System.out.println(player.getType());
        System.out.println(player.getMenu());
        System.out.println(player.getPlaylist());
        System.out.println(player.getMainWindow());
        System.out.println(player.getControlBar());
        System.out.println(player.getFavoritesList());
    }
}
