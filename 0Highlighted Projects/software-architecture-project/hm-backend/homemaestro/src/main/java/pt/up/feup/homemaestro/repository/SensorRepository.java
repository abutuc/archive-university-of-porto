package pt.up.feup.homemaestro.repository;

import pt.up.feup.homemaestro.devices.sensors.Sensor;

import java.util.ArrayList;
import java.util.List;

public class SensorRepository implements CRUDRepository<Sensor> {
    private final List<Sensor> sensors = new ArrayList<>();

    @Override
    public void add(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public void remove(Integer id) {
        sensors.removeIf(actuator -> actuator.getId() == id);
    }

    @Override
    public List<Sensor> getAll() {
        return new ArrayList<>(sensors);
    }

    @Override
    public Sensor findById(Integer id) {
        return sensors.stream().filter(sensor -> sensor.getId() == id).findFirst().orElse(null);
    }

}
