package exercise1;

public class OpenCommand implements Command {
    private final BoardScreen boardScreen = new BoardScreen();

    @Override
    public void execute() {
        boardScreen.open();
    }
}
