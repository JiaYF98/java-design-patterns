package exercise1;

public class EditCommand implements Command {
    private final BoardScreen boardScreen = new BoardScreen();

    @Override
    public void execute() {
        boardScreen.edit();
    }
}
