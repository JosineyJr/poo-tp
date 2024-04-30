package poo.tp.domain.users.service;

import poo.tp.app.dto.employee.CreateEmployeeDto;
import poo.tp.app.dto.employee.DeleteEmployeeDto;
import poo.tp.app.dto.employee.EmployeeDto;
import poo.tp.app.dto.employee.UpdateEmployeeDto;
import poo.tp.app.mapper.EmployeeMapper;
import poo.tp.domain.users.exception.EmployeeAlreadyExistsException;
import poo.tp.domain.users.exception.EmployeeNotFoundException;
import poo.tp.domain.users.model.Employee;
import poo.tp.domain.users.repository.IEmployeeRepository;

public class EmployeeService {
  private final IEmployeeRepository employeeRepository;

  public EmployeeService(IEmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  /**
   * Create a new employee.
   * 
   * @param createEmployeeDto
   */
  public void create(CreateEmployeeDto createEmployeeDto) {
    Employee employeeFound = employeeRepository.findByCPF(createEmployeeDto.getCPF());

    if (employeeFound != null) {
      throw new EmployeeAlreadyExistsException("Employee already exists.");
    }

    employeeRepository.create(employeeFound);
  }

  /**
   * Update a employee.
   * 
   * @param updateEmployeeDto
   */
  public void update(UpdateEmployeeDto updateEmployeeDto) {
    Employee employeeFound = employeeRepository.findByID(updateEmployeeDto.getID());

    if (employeeFound == null) {
      throw new EmployeeNotFoundException("Employee not found.");
    }

    employeeFound.setFirstName(updateEmployeeDto.getFirstName());
    employeeFound.setLastName(updateEmployeeDto.getLastName());
    employeeFound.setRole(updateEmployeeDto.getRole());

    employeeRepository.update(employeeFound);
  }

  /**
   * Delete a employee.
   * 
   * @param deleteEmployeeDto
   */
  public void delete(DeleteEmployeeDto deleteEmployeeDto) {
    Employee employeeFound = employeeRepository.findByID(deleteEmployeeDto.getID());

    if (employeeFound == null) {
      throw new EmployeeNotFoundException("Employee not found.");
    }

    employeeRepository.delete(employeeFound.getID());
  }

  /**
   * Find a employee by ID.
   * 
   * @param ID
   * @return Employee
   */
  public Employee findByID(String ID) {
    Employee employeeFound = employeeRepository.findByID(ID);

    if (employeeFound == null) {
      return null;
    }

    return employeeRepository.findByID(ID);
  }

  /**
   * Find a employee by CPF.
   * 
   * @param CPF
   * @return Employee
   */
  public Employee findByCPF(String CPF) {
    Employee employeeFound = employeeRepository.findByCPF(CPF);

    if (employeeFound == null) {
      return null;
    }

    return employeeRepository.findByCPF(CPF);
  }

  /**
   * Find all employees.
   * 
   * @return List<Employee>
   */
  public Iterable<EmployeeDto> findAll() {
    Iterable<Employee> employees = employeeRepository.findAll();

    return EmployeeMapper.mapEmployeeEntitiesToEmployeeDtos(employees);
  }
}
