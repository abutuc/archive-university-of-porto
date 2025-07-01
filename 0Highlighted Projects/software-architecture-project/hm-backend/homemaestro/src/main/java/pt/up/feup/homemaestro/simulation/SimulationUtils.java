package pt.up.feup.homemaestro.simulation;

import org.apache.logging.log4j.LogManager;

import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SimulationUtils {
    private static final String BASE_URL = "http://simulation:5000/simulation";

    public static String getSensorSimulationURL(String type, int id) {
        return BASE_URL + "/sensor/" + type + "/" + id;
    }

    public static String getActuatorSimulationURL(String type, int id) {
        return BASE_URL + "/actuator/" + type + "/" + id;
    }

    public static String getHubSimulationURL(String type, int id) {
        return BASE_URL + "/hub/" + type + "/" + id;
    }

    public static void requestToSimulation(String url, String requestMethod) {
        if (SimulationHandler.isSimulationInactive()) return;
        HttpRequest request;

        switch (requestMethod) {
            case "POST":
                request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .POST(HttpRequest.BodyPublishers.noBody())
                        .build();
                break;
            case "DELETE":
                request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .DELETE()
                        .build();
                break;
            default:
                LogManager.getLogger("Simulation").error("Invalid request method.");
                return;
        }

        try {
            var client = HttpClient.newHttpClient();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                LogManager.getLogger("Simulation").error("Failed to request to simulation. Status code: {}", response.statusCode());
            }
        } catch (ConnectException e) {
            LogManager.getLogger("Simulation").error("Failed to connect to the server. Please ensure the server is running and accessible.");
        } catch (Exception e) {
            LogManager.getLogger("Simulation").error(e.getMessage());
        }
    }

}
