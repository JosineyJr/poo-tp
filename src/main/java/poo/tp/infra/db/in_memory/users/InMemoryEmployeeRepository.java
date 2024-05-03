package poo.tp.infra.db.in_memory.users;

import java.util.HashMap;
import java.util.Map;

import poo.tp.domain.model.users.Employee;
import poo.tp.domain.repository.users.IEmployeeRepository;

public class InMemoryEmployeeRepository implements IEmployeeRepository {
  private final Map<String, Employee> employees = new HashMap<>();

  public void create(Employee employee) {
    employees.put(employee.getID(), employee);
  }

  public void update(Employee employee) {
    employees.put(employee.getID(), employee);
  }

  public void delete(String ID) {
    employees.remove(ID);
  }

  public Employee findByID(String ID) {
    return employees.get(ID);
  }

  public Employee findByCPF(String CPF) {
    return employees.values().stream().filter(employee -> employee.getCPF().equals(CPF)).findFirst().orElse(null);
  }

  public Iterable<Employee> findAll() {
    return employees.values();
  }
}
