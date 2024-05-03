package poo.tp.domain.repository;

public interface IRepository<T> {
  public void create(String ID, T entity);
  public T read(String ID);
  public void update(String ID, T entity);
  public void delete(String ID);
  public Iterable<T> list();
}
