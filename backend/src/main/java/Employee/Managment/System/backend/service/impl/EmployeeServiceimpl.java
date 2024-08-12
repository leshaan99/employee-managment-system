package Employee.Managment.System.backend.service.impl;

import Employee.Managment.System.backend.dto.EmployeeDto;
import Employee.Managment.System.backend.entity.Employee;
import Employee.Managment.System.backend.mapper.EmployeeMapper;
import Employee.Managment.System.backend.repository.EmployeeRepository;
import Employee.Managment.System.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }
}
