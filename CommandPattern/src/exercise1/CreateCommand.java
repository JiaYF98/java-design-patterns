package exercise1;

public class CreateCommand implements Command {
    private final BoardScreen boardScreen = new BoardScreen();
    @Override
    public void execute() {
        boardScreen.create();
    }
}
