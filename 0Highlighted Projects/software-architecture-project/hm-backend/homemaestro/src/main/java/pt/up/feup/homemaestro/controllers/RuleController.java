package pt.up.feup.homemaestro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.FanActuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.WindowBlindsActuator;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.interpreter.*;
import pt.up.feup.homemaestro.interpreter.expression.Expression;
import pt.up.feup.homemaestro.repository.Inventory;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/rules")
public class RuleController {

    private final RuleInterpreter ruleInterpreter;

    public RuleController() {
        this.ruleInterpreter = RuleInterpreter.getRuleInterpreter();
    }

    @PostMapping
    public ResponseEntity<String> addRule(
            @RequestParam String rule) {

        // Generate a unique ID for the rule
        String ruleId = UUID.randomUUID().toString();

        Context context = Context.getInstance();

        for (Sensor sensor : Inventory.getSensorRepository().getAll()) {
            context.setSensorValue(sensor.getName(), sensor.getMeasurementValue());
            context.setSensorState(sensor.getName(), sensor.isOn() ? "on" : "off");
        }

        for (Actuator actuator : Inventory.getActuatorRepository().getAll()) {
            // Check what is the actuator type and set the state accordingly
            if (actuator instanceof FanActuator) {
                context.setActuatorState(actuator.getName(), ((FanActuator) actuator).isFanSwitchOn() ? "on" : "off");
            } else if (actuator instanceof WindowBlindsActuator) {
                context.setActuatorState(actuator.getName(), ((WindowBlindsActuator) actuator).areWindowBlindsDown() ? "down" : "up");
            } else {
                context.setActuatorState(actuator.getName(), actuator.isOn() ? "on" : "off");
            }
        }

        // Parse rule string
        List<String> tokens = Tokenizer.tokenize(rule);
        Parser parser = new Parser(tokens);

        // Get the expression
        Expression expression = parser.parse();

        // Get the actions
        List<Action> actions = parser.getActions();

        // Add rule to RuleInterpreter
        Rule ruleObj = new Rule(ruleId, tokens, expression, actions, rule);
        ruleInterpreter.addRule(ruleObj);

        return ResponseEntity.status(HttpStatus.CREATED).body("Rule added with ID: " + ruleId);
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> getRules() {
        return ResponseEntity.ok(ruleInterpreter.getRuleStrings());
    }

    @GetMapping("/actuatorCommands")
    public ResponseEntity<Map<String, List<String>>> getActuatorCommands() {
        return ResponseEntity.ok(Inventory.getCommandRepository().getAllCommandsGroupedByActuatorType());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRule(@PathVariable String id) {
        Rule ruleToDelete = ruleInterpreter.getRules().stream()
                .filter(rule -> rule.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (ruleToDelete != null) {
            ruleInterpreter.removeRule(ruleToDelete);
            NotifierSingleton.getInstance().notify("\u001B[31mREMOVED RULE:\u001B[0m " + ruleToDelete.getRuleString());
            return ResponseEntity.ok("Rule deleted with ID: " + id);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Rule not found with ID: " + id);
        }
    }
}