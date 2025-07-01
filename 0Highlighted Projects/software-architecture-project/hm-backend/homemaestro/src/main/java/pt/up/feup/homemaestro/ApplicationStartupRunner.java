package pt.up.feup.homemaestro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pt.up.feup.homemaestro.services.OrchestratorService;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    @Autowired
    private OrchestratorService orchestratorService;

    @Override
    public void run(String... args) {
        // Start system needs
        orchestratorService.startSystem();

        // Start simulation
        // Simulation.run();
    }
}