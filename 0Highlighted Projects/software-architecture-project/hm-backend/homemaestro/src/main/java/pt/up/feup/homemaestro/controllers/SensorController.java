package pt.up.feup.homemaestro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.devices.DeviceFactory;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.devices.sensors.concrete.factories.LightSensorFactory;
import pt.up.feup.homemaestro.devices.sensors.concrete.factories.TemperatureSensorFactory;
import pt.up.feup.homemaestro.devices.sensors.concrete.products.LightSensor;
import pt.up.feup.homemaestro.devices.sensors.concrete.products.TemperatureSensor;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.protocols.zigbee.ZigBeeProtocol;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.simulation.SimulationSensorController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @GetMapping
    public Collection<Sensor> getAllSensors() {
        return Inventory.getSensorRepository().getAll();
    }

    @GetMapping("/{id}")
    public Sensor getSensorById(@PathVariable Integer id) {
        return Inventory.getSensorRepository().findById(id);
    }

    @PostMapping
    public ResponseEntity<Device> createSensor(@RequestParam String type, @RequestParam String protocol) {
        Protocol<?> protocolObject = getProtocol(protocol);

        DeviceFactory sensorFactory = getSensorFactory(type);
        Device sensor = sensorFactory.createDevice(protocolObject);

        if (sensor == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create sensor");
        }

        return ResponseEntity.ok(sensor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSensor(@PathVariable Integer id) {
        Optional<Sensor> sensor = Inventory.getSensorRepository().getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (sensor.isPresent()) {
            Inventory.getSensorRepository().remove(id);
            // Delete the External sensor
            if (sensor.get() instanceof TemperatureSensor) {
                SimulationSensorController.deleteSensorExternal(id, "temperature");
            } else if (sensor.get() instanceof LightSensor) {
                SimulationSensorController.deleteSensorExternal(id, "light");
            } else {
                return ResponseEntity.badRequest().body("Invalid sensor type");
            }
            return ResponseEntity.ok("Sensor deleted");
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/activate")
    public ResponseEntity<String> connectSensor(@PathVariable Integer id) {
        Optional<Sensor> sensor = Inventory.getSensorRepository().getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (sensor.isPresent()) {
            if (!sensor.get().isOn()) {
                sensor.get().activate();
                // Activate the External sensor
                if (sensor.get() instanceof TemperatureSensor) {
                    SimulationSensorController.activateSensor(id, "temperature");
                } else if (sensor.get() instanceof LightSensor) {
                    SimulationSensorController.activateSensor(id, "light");
                } else {
                    return ResponseEntity.badRequest().body("Invalid sensor type");
                }
                return ResponseEntity.ok("Sensor activated");
            } else {
                return ResponseEntity.badRequest().body("Sensor is already activated");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/deactivate")
    public ResponseEntity<String> disconnectSensor(@PathVariable Integer id) {
        Optional<Sensor> sensor = Inventory.getSensorRepository().getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (sensor.isPresent()) {
            if (sensor.get().isOn()) {
                sensor.get().deactivate();
                // Deactivate the External sensor
                if (sensor.get() instanceof TemperatureSensor) {
                    SimulationSensorController.deactivateSensor(id, "temperature");
                } else if (sensor.get() instanceof LightSensor) {
                    SimulationSensorController.deactivateSensor(id, "light");
                } else {
                    return ResponseEntity.badRequest().body("Invalid sensor type");
                }
                return ResponseEntity.ok("Sensor deactivated");
            } else {
                return ResponseEntity.badRequest().body("Sensor is already deactivated");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public Sensor updateSensor(@PathVariable Integer id, @RequestParam Double measurementValue, @RequestParam boolean isOn) {
        Sensor sensor = Inventory.getSensorRepository().findById(id);
        if (sensor != null) {
            sensor.setMeasurementValue(measurementValue);
            sensor.setIsOn(isOn);
            return sensor;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sensor not found");
    }

    private Protocol<?> getProtocol(String protocol) {
        return switch (protocol) {
            case "ZigBee" -> new ZigBeeProtocol();
            case "Internal" -> new InternalProtocol();
            default -> throw new IllegalArgumentException("Unknown product type: " + protocol);
        };
    }

    private DeviceFactory getSensorFactory(String type) {
        return switch (type) {
            case "Light" -> new LightSensorFactory();
            case "Temperature" -> new TemperatureSensorFactory();
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }
}
