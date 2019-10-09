package application.domain.command;

public class LeftCommand extends Command {
    LeftCommand() {
        super();
        setCommandName("left");
    }

    @Override
    public void execute(Integer param) {
        super.execute(param);
        System.out.println("left execute.");
    }
}
