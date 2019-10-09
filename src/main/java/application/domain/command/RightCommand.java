package application.domain.command;

public class RightCommand extends Command {

    RightCommand() {
        super();
        setCommandName("right");
    }

    @Override
    public void execute(Integer param) {
        super.execute(param);
        System.out.println("right execute.");
    }
}
