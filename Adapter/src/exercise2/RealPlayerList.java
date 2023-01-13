package exercise2;

public class RealPlayerList implements PlayerList {
    private final RealPlayerAPI rapi = new RealPlayerAPI();

    @Override
    public void showPlayerList() {
        rapi.showPlayerList();
    }
}
