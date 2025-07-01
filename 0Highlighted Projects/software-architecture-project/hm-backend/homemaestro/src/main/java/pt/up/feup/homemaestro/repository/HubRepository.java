package pt.up.feup.homemaestro.repository;

import pt.up.feup.homemaestro.devices.hubs.Hub;

import java.util.ArrayList;
import java.util.List;

public class HubRepository implements CRUDRepository<Hub> {
    private final List<Hub> hubs = new ArrayList<>();

    @Override
    public void add(Hub hub) {
        hubs.add(hub);
    }

    @Override
    public void remove(Integer id) {
        hubs.removeIf(hubs -> hubs.getId() == id);
    }

    @Override
    public List<Hub> getAll() {
        return new ArrayList<>(hubs);
    }

    @Override
    public Hub findById(Integer id) {
        return hubs.stream().filter(hub -> hub.getId() == id).findFirst().orElse(null);
    }

}
