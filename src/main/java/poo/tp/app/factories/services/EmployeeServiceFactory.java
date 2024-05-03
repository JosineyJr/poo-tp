package poo.tp.app.factories.services;

import poo.tp.domain.service.users.EmployeeService;
import poo.tp.infra.db.in_memory.users.InMemoryEmployeeRepository;

public class EmployeeServiceFactory {
  public static EmployeeService createService() {
    InMemoryEmployeeRepository employeeRepository = new InMemoryEmployeeRepository();

    return new EmployeeService(employeeRepository);
  }
}
