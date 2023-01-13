package exercise2;

public class RealPlayerWindow implements MainWindow {
    private final RealPlayerAPI rapi = new RealPlayerAPI();

    @Override
    public void show() {
        rapi.showWindow();
    }
}
