package application.domain.command;

public class QuitCommand extends Command {

    QuitCommand() {
        super();
        setCommandName("quit");
    }

    @Override
    public void execute(Integer param) {
        super.execute(param);
        System.out.println("quit execute.");
    }
}
