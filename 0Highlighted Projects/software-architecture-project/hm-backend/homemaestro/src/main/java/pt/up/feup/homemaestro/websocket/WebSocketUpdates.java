package pt.up.feup.homemaestro.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pt.up.feup.homemaestro.interpreter.Context;

import java.util.HashMap;
import java.util.Map;

@Component
public class WebSocketUpdates {

    private final Context context = Context.getInstance();

    @Autowired
    private SimpMessagingTemplate template; // for sending messages to the client through websocket

    @Scheduled(fixedRate = 3000) // Schedule to run every 3 seconds
    public void sendUpdatesToWebSocket() {
        template.convertAndSend("/topic/sensorValues", context.getSensorValues());
        template.convertAndSend("/topic/sensorStates", context.getSensorStates());
        template.convertAndSend("/topic/actuatorStates", context.getActuatorStates());

        Map<String, String> actuatorLastCommands = new HashMap<>();

        context.getActuatorLastCommand().forEach((actuator, command) -> {
            String[] parts = command.getClass().getSimpleName().split("Actuator"); // Use only the index 1
            // Remove the "Command" part from the class name
            String commandString = parts[1].substring(0, parts[1].length() - 7);
            actuatorLastCommands.put(actuator, commandString);
        });

        template.convertAndSend("/topic/actuatorLastCommands", actuatorLastCommands);
    }
}