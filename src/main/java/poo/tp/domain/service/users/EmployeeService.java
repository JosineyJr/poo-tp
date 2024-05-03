package poo.tp.domain.service.users;

import poo.tp.app.dto.employee.CreateEmployeeDto;
import poo.tp.app.dto.employee.DeleteEmployeeDto;
import poo.tp.app.dto.employee.EmployeeDto;
import poo.tp.app.dto.employee.UpdateEmployeeDto;
import poo.tp.app.mapper.EmployeeMapper;
import poo.tp.domain.exception.users.EmployeeAlreadyExistsException;
import poo.tp.domain.exception.users.EmployeeNotFoundException;
import poo.tp.domain.model.users.Employee;
import poo.tp.domain.repository.users.IEmployeeRepository;

public class EmployeeService {
  private final IEmployeeRepository employeeRepository;

  public EmployeeService(IEmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  /**
   * Create a new employee.
   * 
   * @param createEmployeeDto
   * @throws EmployeeAlreadyExistsException
   */
  public void create(CreateEmployeeDto createEmployeeDto) throws EmployeeAlreadyExistsException {
    Employee employeeFound = employeeRepository.findByCPF(createEmployeeDto.getCPF());

    if (employeeFound != null) {
      throw new EmployeeAlreadyExistsException("Employee already exists.");
    }

    Employee employee = new Employee(createEmployeeDto.getFirstName(), createEmployeeDto.getLastName(),
        createEmployeeDto.getCPF(), createEmployeeDto.getRole());

    employeeRepository.create(employee.getID(), employee);
  }

  /**
   * Update a employee.
   * 
   * @param updateEmployeeDto
   * @throws EmployeeNotFoundException
   */
  public void update(UpdateEmployeeDto updateEmployeeDto) throws EmployeeNotFoundException {
    Employee employeeFound = employeeRepository.read(updateEmployeeDto.getID());

    if (employeeFound == null) {
      throw new EmployeeNotFoundException("Employee not found.");
    }

    employeeFound.setFirstName(updateEmployeeDto.getFirstName());
    employeeFound.setLastName(updateEmployeeDto.getLastName());
    employeeFound.setRole(updateEmployeeDto.getRole());

    employeeRepository.update(employeeFound.getID(), employeeFound);
  }

  /**
   * Delete a employee.
   * 
   * @param deleteEmployeeDto
   * @throws EmployeeNotFoundException
   */
  public void delete(DeleteEmployeeDto deleteEmployeeDto) throws EmployeeNotFoundException {
    Employee employeeFound = employeeRepository.read(deleteEmployeeDto.getID());

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
    Employee employeeFound = employeeRepository.read(ID);

    if (employeeFound == null) {
      return null;
    }

    return employeeRepository.read(ID);
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
    Iterable<Employee> employees = employeeRepository.list();

    return EmployeeMapper.mapEmployeeEntitiesToEmployeeDtos(employees);
  }
}
