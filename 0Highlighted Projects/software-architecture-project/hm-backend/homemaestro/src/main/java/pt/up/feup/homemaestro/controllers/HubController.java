package pt.up.feup.homemaestro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.devices.DeviceFactory;
import pt.up.feup.homemaestro.devices.hubs.Hub;
import pt.up.feup.homemaestro.devices.hubs.concrete.factories.ZigBeeHubFactory;
import pt.up.feup.homemaestro.devices.hubs.concrete.products.ZigBeeHub;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.protocols.zigbee.ZigBeeProtocol;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.simulation.SimulationHubController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hubs")
public class HubController {

    @GetMapping
    public Collection<Hub> getAllHubs() {
        return Inventory.getHubRepository().getAll();
    }

    @PostMapping
    public ResponseEntity<Device> createHub(@RequestParam String protocol) {
        Protocol<?> protocolObject = getProtocol(protocol);

        DeviceFactory hubFactory = getHubFactory(protocol);
        Device hub = hubFactory.createDevice(protocolObject);

        if (hub == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create actuator");
        }

        return ResponseEntity.ok(hub);
    }

    // Activate a Hub by ID
    @PostMapping("/{id}/activate")
    public ResponseEntity<String> connectHub(@PathVariable Integer id) {
        Optional<Hub> hub = Inventory.getHubRepository().getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        if (hub.isPresent()) {
            if (!hub.get().isOn()) {
                hub.get().activate();
                if (hub.get() instanceof ZigBeeHub) {
                    SimulationHubController.activateHub(id, "zigbee");
                } else {
                    return ResponseEntity.badRequest().body("Hub type not supported.");
                }
                return ResponseEntity.ok("Hub activated.");
            } else {
                return ResponseEntity.badRequest().body("Hub is already activated.");
            }
        }
        return ResponseEntity.notFound().build();
    }

    // Deactivate a Hub by ID
    @PostMapping("/{id}/deactivate")
    public ResponseEntity<String> disconnectHub(@PathVariable Integer id) {
        Optional<Hub> hub = Inventory.getHubRepository().getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        if (hub.isPresent()) {
            if (hub.get().isOn()) {
                hub.get().deactivate();
                if (hub.get() instanceof ZigBeeHub) {
                    SimulationHubController.deactivateHub(id, "zigbee");
                } else {
                    return ResponseEntity.badRequest().body("Hub type not supported.");
                }

                return ResponseEntity.ok("Hub deactivated.");
            } else {
                return ResponseEntity.badRequest().body("Hub is already deactivated.");
            }
        }
        return ResponseEntity.notFound().build();
    }

    // Get all Hubs
    @GetMapping("/list")
    public ResponseEntity<List<Hub>> listHubs() {
        List<Hub> hubs = new ArrayList<>(Inventory.getHubRepository().getAll());
        return ResponseEntity.ok(hubs);
    }

    // Get Hub details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Hub> getHubById(@PathVariable Integer id) {
        Optional<Hub> hub = Inventory.getHubRepository().getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        return hub.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete a Hub by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHub(@PathVariable Integer id) {
        Optional<Hub> hub = Inventory.getHubRepository().getAll().stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        if (hub.isPresent()) {
            Inventory.getHubRepository().remove(id);
            if (hub.get() instanceof ZigBeeHub) {
                SimulationHubController.deleteHubExternal(id, "zigbee");
            } else {
                return ResponseEntity.badRequest().body("Hub type not supported.");
            }

            return ResponseEntity.ok("Hub deleted.");
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

    private DeviceFactory getHubFactory(String type) {
        return switch (type) {
            case "ZigBee" -> new ZigBeeHubFactory();
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }
}
