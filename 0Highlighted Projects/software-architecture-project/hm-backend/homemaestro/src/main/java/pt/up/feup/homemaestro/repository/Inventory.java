package pt.up.feup.homemaestro.repository;

public class Inventory {
    private static final HubRepository hubRepository = new HubRepository();
    private static final SensorRepository sensorRepository = new SensorRepository();
    private static final ActuatorRepository actuatorRepository = new ActuatorRepository();
    private static final CommandRepository commandRepository = new CommandRepository();
    private static final HybridDeviceRepository hybridDeviceRepository = new HybridDeviceRepository();

    public static HubRepository getHubRepository() {
        return hubRepository;
    }

    public static SensorRepository getSensorRepository() {
        return sensorRepository;
    }

    public static ActuatorRepository getActuatorRepository() {
        return actuatorRepository;
    }

    public static CommandRepository getCommandRepository() {
        return commandRepository;
    }

    public static HybridDeviceRepository getHybridDeviceRepository() {
        return hybridDeviceRepository;
    }

}
