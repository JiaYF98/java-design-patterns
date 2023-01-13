package exercise2;

public class Client {
    public static void main(String[] args) {
        PlayerFactory factory = new MediaPlayerFactory();
        MainWindow mainWindow = factory.createMainWindow();
        PlayerList playerList = factory.createPlayerList();
        mainWindow.show();
        playerList.showPlayerList();

        System.out.println("*******************");

        factory = new RealPlayerFactory();
        mainWindow = factory.createMainWindow();
        playerList = factory.createPlayerList();
        mainWindow.show();
        playerList.showPlayerList();
    }
}
