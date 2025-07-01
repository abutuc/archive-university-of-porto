package pt.up.feup.homemaestro.simulation;

public class SimulationActuatorController {

    public static void createActuator(String type, Integer id) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id);
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void deleteActuatorExternal(Integer id, String type) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id);
        SimulationUtils.requestToSimulation(url, "DELETE");
    }

    public static void activateActuator(Integer id, String type) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id) + "/activate";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void deactivateActuator(Integer id, String type) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id) + "/deactivate";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void turnOnActuator(String type, Integer id) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id) + "/turn-on";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void turnOffActuator(String type, Integer id) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id) + "/turn-off";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void goDownActuator(String type, Integer id) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id) + "/go-down";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void goUpActuator(String type, Integer id) {
        String url = SimulationUtils.getActuatorSimulationURL(type, id) + "/go-up";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void increaseFanActuatorIntensity(int id) {
        String url = SimulationUtils.getActuatorSimulationURL("fan", id) + "/increase-intensity";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void decreaseFanActuatorIntensity(int id) {
        String url = SimulationUtils.getActuatorSimulationURL("fan", id) + "/decrease-intensity";
        SimulationUtils.requestToSimulation(url, "POST");
    }
}
