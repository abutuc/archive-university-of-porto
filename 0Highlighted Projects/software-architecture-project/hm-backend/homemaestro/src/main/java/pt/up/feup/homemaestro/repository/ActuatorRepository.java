package pt.up.feup.homemaestro.repository;

import pt.up.feup.homemaestro.devices.actuators.Actuator;

import java.util.ArrayList;
import java.util.List;

public class ActuatorRepository implements CRUDRepository<Actuator> {
    private final List<Actuator> actuators = new ArrayList<>();

    @Override
    public void add(Actuator actuator) {
        actuators.add(actuator);
    }

    @Override
    public void remove(Integer id) {
        actuators.removeIf(actuator -> actuator.getId() == id);
    }

    @Override
    public List<Actuator> getAll() {
        return new ArrayList<>(actuators);
    }

    @Override
    public Actuator findById(Integer id) {
        return actuators.stream().filter(actuator -> actuator.getId() == id).findFirst().orElse(null);
    }

    public Actuator findByName(String name) {
        return actuators.stream().filter(actuator -> actuator.getName().equals(name)).findFirst().orElse(null);
    }
}