package pt.up.feup.homemaestro.simulation;

public class SimulationSensorController {

    public static void createSensor(String type, Integer id) {
        String url = SimulationUtils.getSensorSimulationURL(type, id);
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void deleteSensorExternal(Integer id, String type) {
        String url = SimulationUtils.getSensorSimulationURL(type, id);
        SimulationUtils.requestToSimulation(url, "DELETE");
    }

    public static void activateSensor(Integer id, String type) {
        String url = SimulationUtils.getSensorSimulationURL(type, id) + "/activate";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void deactivateSensor(Integer id, String type) {
        String url = SimulationUtils.getSensorSimulationURL(type, id) + "/deactivate";
        SimulationUtils.requestToSimulation(url, "POST");
    }
}
