package pt.up.feup.homemaestro.orchestrators;

import pt.up.feup.homemaestro.commands.Command;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.enums.DeviceType;
import pt.up.feup.homemaestro.interpreter.Action;
import pt.up.feup.homemaestro.interpreter.RuleInterpreter;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.pubsub.PubSub;
import pt.up.feup.homemaestro.pubsub.Subscriber;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.utils.RoutingUtils;

import java.util.List;

public final class Orchestrator implements Subscriber {
    private static volatile Orchestrator instance;

    private final PubSub server;
    private final RuleInterpreter ruleInterpreter;
    private Protocol<?> protocol;

    private Orchestrator() {
        this.server = PubSub.getInstance();
        this.ruleInterpreter = RuleInterpreter.getRuleInterpreter();
        this.protocol = new InternalProtocol();
    }

    public static Orchestrator getInstance() {
        Orchestrator result = instance;
        if (result != null) {
            return result;
        }
        synchronized (PubSub.class) {
            if (instance == null) {
                instance = new Orchestrator();
            }
            return instance;
        }
    }

    public void run() {
        server.subscribe(RoutingUtils.getEventQueue(DeviceType.Sensor, protocol.getClass()), this);
        server.subscribe(RoutingUtils.getEventQueue(DeviceType.Actuator, protocol.getClass()), this);
    }

    @Override
    public void update(String eventQueue, Object message) {
        if (eventQueue.equals(RoutingUtils.getEventQueue(DeviceType.Sensor, protocol.getClass()))) {
            List<Action> actions = ruleInterpreter.evaluateRules(message);
            for (Action action : actions) {
                Command command = action.command();
                Actuator actuator = Inventory.getActuatorRepository().findByName(action.actuatorName());
                command.setReceiver(actuator);
                command.execute();
            }
        }

        if (eventQueue.equals(RoutingUtils.getEventQueue(DeviceType.Actuator, protocol.getClass()))) {
            System.out.println(message);
        }
    }

    public Protocol<?> getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol<?> protocol) {
        this.protocol = protocol;
    }
}
