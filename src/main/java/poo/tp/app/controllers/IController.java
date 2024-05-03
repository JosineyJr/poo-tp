package poo.tp.app.controllers;

public interface IController<T, C, U> {
  public void create(C object);

  public T read(String ID);

  public void update(U object);

  public void delete(String ID);

  public Iterable<T> list();
}
