package example;

public class HelpCommand extends Command {
    private DisplayHelpClass displayHelpClass = new DisplayHelpClass();
    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
