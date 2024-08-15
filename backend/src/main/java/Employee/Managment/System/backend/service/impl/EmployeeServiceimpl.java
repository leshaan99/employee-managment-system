package Employee.Managment.System.backend.service.impl;

import Employee.Managment.System.backend.entity.Employee;
import Employee.Managment.System.backend.repository.EmployeeRepository;
import Employee.Managment.System.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
