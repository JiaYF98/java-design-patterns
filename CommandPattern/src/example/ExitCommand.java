package example;

public class ExitCommand extends Command {
    private SystemExitClass systemExitClass = new SystemExitClass();
    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
