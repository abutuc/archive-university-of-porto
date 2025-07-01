package pt.up.feup.homemaestro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.devices.DeviceFactory;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.factories.FanActuatorFactory;
import pt.up.feup.homemaestro.devices.actuators.concrete.factories.WindowBlindsActuatorFactory;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.FanActuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.WindowBlindsActuator;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.protocols.zigbee.ZigBeeProtocol;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.simulation.SimulationActuatorController;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actuators")
public class ActuatorController {

    @GetMapping
    public Collection<Actuator> getAllActuators() {
        return Inventory.getActuatorRepository().getAll();
    }

    @GetMapping("/{id}")
    public Actuator getActuatorById(@PathVariable Integer id) {
        return Inventory.getActuatorRepository().findById(id);
    }

    @PostMapping
    public ResponseEntity<Device> createActuator(@RequestParam String type, @RequestParam String protocol) {
        Protocol<?> protocolObject = getProtocol(protocol);

        DeviceFactory actuatorFactory = getActuatorFactory(type);
        Device actuator = actuatorFactory.createDevice(protocolObject);

        if (actuator == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create actuator");
        }

        return ResponseEntity.ok(actuator);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteActuator(@PathVariable Integer id) {
        Optional<Actuator> actuator = Inventory.getActuatorRepository().getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (actuator.isPresent()) {
            Inventory.getActuatorRepository().remove(id);
            // Delete the External actuator
            if (actuator.get() instanceof FanActuator) {
                SimulationActuatorController.deleteActuatorExternal(id, "fan");
            } else if (actuator.get() instanceof WindowBlindsActuator) {
                SimulationActuatorController.deleteActuatorExternal(id, "window-blinds");
            } else {
                return ResponseEntity.badRequest().body("Invalid actuator type");
            }

            return ResponseEntity.ok("actuator deleted");
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/activate")
    public ResponseEntity<String> connectActuator(@PathVariable Integer id) {
        Optional<Actuator> actuator = Inventory.getActuatorRepository().getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (actuator.isPresent()) {
            if (!actuator.get().isOn()) {
                actuator.get().activate();
                // Activate the External actuator
                if (actuator.get() instanceof FanActuator) {
                    SimulationActuatorController.activateActuator(id, "fan");
                } else if (actuator.get() instanceof WindowBlindsActuator) {
                    SimulationActuatorController.activateActuator(id, "window-blinds");
                } else {
                    return ResponseEntity.badRequest().body("Invalid actuator type");
                }

                return ResponseEntity.ok("Actuator activated");
            } else {
                return ResponseEntity.badRequest().body("Actuator is already activated");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/deactivate")
    public ResponseEntity<String> disconnectActuator(@PathVariable Integer id) {
        Optional<Actuator> actuator = Inventory.getActuatorRepository().getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (actuator.isPresent()) {
            if (actuator.get().isOn()) {
                actuator.get().deactivate();
                // Deactivate the External actuator
                if (actuator.get() instanceof FanActuator) {
                    SimulationActuatorController.deactivateActuator(id, "fan");
                } else if (actuator.get() instanceof WindowBlindsActuator) {
                    SimulationActuatorController.deactivateActuator(id, "window-blinds");
                } else {
                    return ResponseEntity.badRequest().body("Invalid actuator type");
                }

                return ResponseEntity.ok("Actuator deactivated");
            } else {
                return ResponseEntity.badRequest().body("Actuator is already deactivated");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<Actuator>> listActuators() {
        List<Actuator> actuators = Inventory.getActuatorRepository().getAll();
        return ResponseEntity.ok(actuators);
    }


    private Protocol<?> getProtocol(String protocol) {
        return switch (protocol) {
            case "ZigBee" -> new ZigBeeProtocol();
            case "Internal" -> new InternalProtocol();
            default -> throw new IllegalArgumentException("Unknown product type: " + protocol);
        };
    }

    private DeviceFactory getActuatorFactory(String type) {
        return switch (type) {
            case "Fan" -> new FanActuatorFactory();
            case "WindowBlinds" -> new WindowBlindsActuatorFactory();
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }
}