package poo.tp.app.mapper;

import java.util.ArrayList;
import java.util.List;

import poo.tp.app.dto.employee.EmployeeDto;
import poo.tp.domain.model.users.Employee;

public class EmployeeMapper {
  public static EmployeeDto mapEmployeeEntityToEmployeeDto(Employee employee) {
    return new EmployeeDto(employee.getID(), employee.getFirstName() + " " + employee.getLastName(),
        employee.getRole().toString());
  }

  public static Iterable<EmployeeDto> mapEmployeeEntitiesToEmployeeDtos(Iterable<Employee> employees) {
    List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();

    for (Employee employee : employees) {
      employeeDtos.add(mapEmployeeEntityToEmployeeDto(employee));
    }

    return employeeDtos;
  }
}
