package exercise2;

public class RealPlayerFactory implements PlayerFactory {
    @Override
    public MainWindow createMainWindow() {
        System.out.println("创建 RealPlayerMainWindow 成功！");
        return new RealPlayerWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        System.out.println("创建 RealPlayerPlayerList 成功！");
        return new RealPlayerList();
    }
}
