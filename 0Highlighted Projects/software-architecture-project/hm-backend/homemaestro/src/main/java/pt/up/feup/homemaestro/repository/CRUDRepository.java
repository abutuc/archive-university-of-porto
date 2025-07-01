package pt.up.feup.homemaestro.repository;

import java.util.List;

public interface CRUDRepository<T> {
    void add(T device);

    void remove(Integer id);

    List<T> getAll();

    T findById(Integer id);
}
