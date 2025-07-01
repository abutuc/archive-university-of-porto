package pt.up.feup.homemaestro.services;

import org.springframework.stereotype.Service;

import pt.up.feup.homemaestro.interpreter.RuleInterpreter;
import pt.up.feup.homemaestro.orchestrators.Orchestrator;
import pt.up.feup.homemaestro.pubsub.PubSub;
import pt.up.feup.homemaestro.simulation.SimulationHandler;

@Service
public class OrchestratorService {

    public void startSystem() {
        PubSub.getInstance();
        Orchestrator.getInstance().run();
        RuleInterpreter.getRuleInterpreter();
        SimulationHandler.enable();
    }
}
