package pt.up.feup.homemaestro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.FanActuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.WindowBlindsActuator;
import pt.up.feup.homemaestro.devices.hybrid.HybridDevice;
import pt.up.feup.homemaestro.devices.hybrid.HybridDeviceFactory;
import pt.up.feup.homemaestro.devices.hybrid.concrete.factories.AirConditioner;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.devices.sensors.concrete.products.LightSensor;
import pt.up.feup.homemaestro.devices.sensors.concrete.products.TemperatureSensor;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.protocols.zigbee.ZigBeeProtocol;
import pt.up.feup.homemaestro.repository.HybridDeviceRepository;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.simulation.SimulationActuatorController;
import pt.up.feup.homemaestro.simulation.SimulationSensorController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hybrid-device")
public class HybridDeviceController {

    private final HybridDeviceRepository inventory = Inventory.getHybridDeviceRepository();
    @Autowired
    ActuatorController actuatorController;
    @Autowired
    SensorController sensorController;

    @GetMapping
    public Collection<HybridDevice> getHybridDevices() {
        return inventory.getAll();
    }

    @PostMapping
    public ResponseEntity<HybridDevice> createHybridDevice(@RequestParam String type, @RequestParam String protocol) {
        Protocol<?> protocolObject = getProtocol(protocol);

        HybridDeviceFactory hybridDeviceFactory = getHybridDeviceFactory(type);
        HybridDevice hybridDevice = hybridDeviceFactory.createHybridDevice(protocolObject);

        if (hybridDevice == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create actuator");
        }

        return ResponseEntity.ok(hybridDevice);
    }

    @PostMapping("/{id}/activate")
    public ResponseEntity<String> connectHybridDevice(@PathVariable Integer id) {
        Optional<HybridDevice> hybridDevice = inventory.getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        if (hybridDevice.isPresent()) {
            HybridDevice hybridDevice1 = hybridDevice.get();
            hybridDevice1.setOn(true);
            for (Integer sensorId : hybridDevice1.getSensors().keySet()) {
                Sensor sensor = hybridDevice1.getSensors().get(sensorId);
                sensor.activate();
                if (sensor instanceof TemperatureSensor) {
                    SimulationSensorController.activateSensor(sensorId, "temperature");
                } else if (sensor instanceof LightSensor) {
                    SimulationSensorController.activateSensor(sensorId, "light");
                }
            }
            for (Integer actuatorId : hybridDevice1.getActuators().keySet()) {
                Actuator actuator = hybridDevice1.getActuators().get(actuatorId);
                actuator.activate();
                if (actuator instanceof FanActuator) {
                    SimulationActuatorController.activateActuator(actuatorId, "fan");
                } else if (actuator instanceof WindowBlindsActuator) {
                    SimulationActuatorController.activateActuator(actuatorId, "window-blinds");
                }
            }

        }
        return ResponseEntity.notFound().build();
    }


    @PostMapping("/{id}/deactivate")
    public ResponseEntity<String> disconnectHub(@PathVariable Integer id) {
        Optional<HybridDevice> hybridDevice = inventory.getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        if (hybridDevice.isPresent()) {
            HybridDevice hybridDevice1 = hybridDevice.get();
            hybridDevice1.setOn(false);
            for (Integer sensorId : hybridDevice1.getSensors().keySet()) {
                Sensor sensor = hybridDevice1.getSensors().get(sensorId);
                sensor.deactivate();
                if (sensor instanceof TemperatureSensor) {
                    SimulationSensorController.deactivateSensor(id, "temperature");
                } else if (sensor instanceof LightSensor) {
                    SimulationSensorController.deactivateSensor(id, "light");
                }
            }
            for (Integer actuatorId : hybridDevice1.getActuators().keySet()) {
                Actuator actuator = hybridDevice1.getActuators().get(actuatorId);
                actuator.deactivate();
                if (actuator instanceof FanActuator) {
                    SimulationActuatorController.deactivateActuator(id, "fan");
                } else if (actuator instanceof WindowBlindsActuator) {
                    SimulationActuatorController.deactivateActuator(id, "window-blinds");
                }
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<HybridDevice>> listHybridDevice() {
        List<HybridDevice> hybridDevices = new ArrayList<>(inventory.getAll());
        return ResponseEntity.ok(hybridDevices);
    }

    // Get Hub details by ID
    @GetMapping("/{id}")
    public ResponseEntity<HybridDevice> getHybridDeviceById(@PathVariable Integer id) {
        return ResponseEntity.ok(inventory.findById(id));
    }

    // Delete a Hub by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHybridDevice(@PathVariable Integer id) {
        Optional<HybridDevice> hybridDevice = inventory.getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        if (hybridDevice.isPresent()) {
            HybridDevice hybridDevice1 = hybridDevice.get();
            for (int actuatorId : hybridDevice1.getActuators().keySet()) {
                actuatorController.deleteActuator(actuatorId);
            }

            for (int sensorId : hybridDevice1.getSensors().keySet()) {
                sensorController.deleteSensor(sensorId);
            }
            inventory.remove(hybridDevice1.getId());
            return ResponseEntity.ok("Hybrid Device deleted.");
        }
        return ResponseEntity.notFound().build();
    }

    private Protocol<?> getProtocol(String protocol) {
        return switch (protocol) {
            case "ZigBee" -> new ZigBeeProtocol();
            case "Internal" -> new InternalProtocol();
            default -> throw new IllegalArgumentException("Unknown product type: " + protocol);
        };
    }

    private HybridDeviceFactory getHybridDeviceFactory(String type) {
        return switch (type) {
            case "AirConditioner" -> new AirConditioner();
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }

}
