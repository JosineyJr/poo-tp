package poo.tp.infra.db.in_memory;

import java.util.HashMap;
import java.util.Map;

import poo.tp.domain.users.model.Employee;
import poo.tp.domain.users.repository.IEmployeeRepository;

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
