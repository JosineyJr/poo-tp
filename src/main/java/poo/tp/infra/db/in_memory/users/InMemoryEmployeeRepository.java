package poo.tp.infra.db.in_memory.users;

import java.util.Map;

import poo.tp.domain.model.users.Employee;
import poo.tp.domain.repository.users.IEmployeeRepository;
import poo.tp.infra.db.in_memory.InMemoryCRUDRepository;

public class InMemoryEmployeeRepository extends InMemoryCRUDRepository<Employee> implements IEmployeeRepository {
  private Map<String, Employee> employees;

  public InMemoryEmployeeRepository() {
    super();

    this.employees = this.getObjects();
  }

  public Employee findByCPF(String CPF) {
    return employees.values().stream().filter(employee -> employee.getCPF().equals(CPF)).findFirst().orElse(null);
  }
}
