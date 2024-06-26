package poo.tp.infra.db.in_memory;

import java.util.HashMap;
import java.util.Map;

import poo.tp.domain.repository.IRepository;

public abstract class InMemoryCRUDRepository<T> implements IRepository<T> {
  protected final Map<String, T> objects = new HashMap<>();

  public Map<String, T> getObjects() {
    return objects;
  }

  public void create(String ID, T object) {
    objects.put(ID, object);
  }

  public T read(String ID) {
    return objects.get(ID);
  }

  public void update(String ID, T object) {
    objects.put(ID, object);
  }

  public void delete(String ID) {
    objects.remove(ID);
  }

  public Iterable<T> list() {
    return objects.values();
  }
}
