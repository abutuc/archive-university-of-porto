package pt.up.feup.homemaestro.simulation;

public class SimulationHandler {

    private static boolean simulationActivation = false;

    public static void enable() {
        simulationActivation = true;
    }

    public static boolean isSimulationInactive() {
        return !simulationActivation;
    }

}
