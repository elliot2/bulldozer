package application.domain.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static application.utilities.StringTool.wrapFirstCharacter;


public class CommandManager {

    private List<Command> commandList = new ArrayList<>();

    public CommandManager() {
        commandList.add(new AdvanceCommand());
        commandList.add(new LeftCommand());
        commandList.add(new RightCommand());
        commandList.add(new QuitCommand());
    }

    public String getCommandList() {
        Stream<String> commands = commandList.stream().map(command -> wrapFirstCharacter(command.getCommandName()));
        return commands.collect(Collectors.joining(", "));
    }

    public Command findCommand(String commandName) {
        return commandList.stream().filter(command -> command.getCommandName().equals(commandName)).findFirst().orElse(null);
    }

}
