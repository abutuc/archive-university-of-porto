package pt.up.feup.homemaestro.repository;

import pt.up.feup.homemaestro.devices.hybrid.HybridDevice;

import java.util.ArrayList;
import java.util.List;

public class HybridDeviceRepository implements CRUDRepository<HybridDevice> {
    private final List<HybridDevice> hybridDevices = new ArrayList<>();

    @Override
    public void add(HybridDevice device) {
        hybridDevices.add(device);
    }

    @Override
    public void remove(Integer id) {
        hybridDevices.removeIf(hybridDevice -> hybridDevice.getId() == id);
    }

    @Override
    public List<HybridDevice> getAll() {
        return hybridDevices;
    }

    @Override
    public HybridDevice findById(Integer id) {
        return hybridDevices.stream().filter(hybridDevice -> hybridDevice.getId() == id).findFirst().orElse(null);
    }
}
