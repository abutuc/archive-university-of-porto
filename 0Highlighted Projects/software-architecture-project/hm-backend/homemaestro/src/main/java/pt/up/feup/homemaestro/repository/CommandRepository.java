package pt.up.feup.homemaestro.repository;

import pt.up.feup.homemaestro.commands.Command;
import pt.up.feup.homemaestro.devices.actuators.Actuator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CommandRepository {
    private final Map<String, Command> commands = new HashMap<>();

    public void add(String commandName, Command command) {
        commands.put(commandName.toUpperCase(), command);
    }

    public void remove(String commandName) {
        commands.remove(commandName.toUpperCase());
    }

    public Command get(String actuatorName, String action) {
        Actuator actuator = Inventory.getActuatorRepository().findByName(actuatorName);

        if (actuator == null) {
            return null;
        }
        return commands.get(actuator.getClass().getSimpleName().toUpperCase() + action.toUpperCase() + "COMMAND");
    }

    public Map<String, List<String>> getAllCommandsGroupedByActuatorType() {
        return commands.keySet().stream()
                .collect(Collectors.groupingBy(
                        // Group by actuator class name (prefix of the command, before the first occurrence of action)
                        command -> {
                            // Extract actuator name until the first "ACTUATOR" (this part is the class name)
                            int actuatorEndIndex = command.indexOf("ACTUATOR") + "ACTUATOR".length();
                            return command.substring(0, actuatorEndIndex); // Actuator name
                        },
                        // Map commands to action names in camelCase (removing the "ACTUATOR" and "COMMAND" parts)
                        Collectors.mapping(
                                command -> {
                                    int actionStartIndex = command.indexOf("ACTUATOR") + "ACTUATOR".length();
                                    int actionEndIndex = command.indexOf("COMMAND");
                                    return command.substring(actionStartIndex, actionEndIndex); // Action name in camelCase
                                },
                                Collectors.toList()
                        )
                ));
    }
}
