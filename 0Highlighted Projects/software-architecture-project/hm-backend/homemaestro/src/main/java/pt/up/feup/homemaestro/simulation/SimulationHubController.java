package pt.up.feup.homemaestro.simulation;

public class SimulationHubController {

    public static void createHub(String type, Integer id) {
        String url = SimulationUtils.getHubSimulationURL(type, id);
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void deleteHubExternal(Integer id, String type) {
        String url = SimulationUtils.getHubSimulationURL(type, id);
        SimulationUtils.requestToSimulation(url, "DELETE");
    }

    public static void activateHub(Integer id, String type) {
        String url = SimulationUtils.getHubSimulationURL(type, id) + "/activate";
        SimulationUtils.requestToSimulation(url, "POST");
    }

    public static void deactivateHub(Integer id, String type) {
        String url = SimulationUtils.getHubSimulationURL(type, id) + "/deactivate";
        SimulationUtils.requestToSimulation(url, "POST");
    }
}
