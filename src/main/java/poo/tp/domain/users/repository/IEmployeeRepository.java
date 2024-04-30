package poo.tp.domain.users.repository;

import poo.tp.domain.users.model.Employee;

public interface IEmployeeRepository {
  /**
   * Creates a new employee.
   * 
   * @param employee The employee to be created.
   */
  public void create(Employee employee);

  /**
   * Updates an employee.
   * 
   * @param employee The employee to be updated.
   */
  public void update(Employee employee);

  /**
   * Deletes an employee.
   * 
   * @param ID The ID of the employee to be deleted.
   */
  public void delete(String ID);

  /**
   * Finds an employee by its ID.
   * 
   * @param ID The ID of the employee to be found.
   * @return The employee found.
   */
  public Employee findByID(String ID);

  /**
   * Finds an employee by its CPF.
   * 
   * @param CPF The CPF of the employee to be found.
   * @return The employee found.
   */
  public Employee findByCPF(String CPF);

  /**
   * Finds all employees.
   * 
   * @return All employees found.
   */
  public Iterable<Employee> findAll();
}
