package poo.tp.infra.db.in_memory;

import java.util.Map;

import poo.tp.domain.model.users.Employee;
import poo.tp.domain.repository.users.IEmployeeRepository;

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
