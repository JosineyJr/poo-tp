package poo.tp.app.factories.services;

import poo.tp.domain.users.service.EmployeeService;
import poo.tp.infra.db.in_memory.InMemoryEmployeeRepository;

public class EmployeeServiceFactory {
  public static EmployeeService createService() {
    InMemoryEmployeeRepository employeeRepository = new InMemoryEmployeeRepository();

    return new EmployeeService(employeeRepository);
  }
}
