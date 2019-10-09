package application.domain.command;

import application.model.Bulldozer;

public abstract class Command {

    Bulldozer bulldozer = Bulldozer.getRef();

    private String commandName;

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public void execute(Integer param) {
    }
}
