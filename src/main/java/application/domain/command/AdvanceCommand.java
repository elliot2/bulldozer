package application.domain.command;

import application.model.Bulldozer;

public class AdvanceCommand extends Command {

    AdvanceCommand() {
        super();
        setCommandName("advance");
    }

    @Override
    public void execute(Integer param) {
        super.execute(param);
        bulldozer.advance(param);
    }
}
