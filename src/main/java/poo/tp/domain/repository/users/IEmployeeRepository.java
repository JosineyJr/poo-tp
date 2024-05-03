package poo.tp.domain.repository.users;

import poo.tp.domain.model.users.Employee;
import poo.tp.domain.repository.IRepository;

public interface IEmployeeRepository extends IRepository<Employee> {
  /**
   * Finds an employee by its CPF.
   * 
   * @param CPF The CPF of the employee to be found.
   * @return The employee found.
   */
  public Employee findByCPF(String CPF);
}
