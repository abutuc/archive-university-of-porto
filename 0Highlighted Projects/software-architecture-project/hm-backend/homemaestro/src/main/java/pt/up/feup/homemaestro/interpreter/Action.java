package pt.up.feup.homemaestro.interpreter;

import pt.up.feup.homemaestro.commands.Command;

public record Action(
        String actuatorName,
        Command command
) {
}
