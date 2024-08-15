package Employee.Managment.System.backend.controller;

import Employee.Managment.System.backend.Request.CreateUserRequest;
import Employee.Managment.System.backend.dto.EmployeeDto;
import Employee.Managment.System.backend.entity.Employee;
import Employee.Managment.System.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("")
    public ResponseEntity<Employee> createEmployee(@RequestBody CreateUserRequest req){
        Employee employee  = new Employee();
        employee.setEmail(req.getEmail());
        employee.setFirstName(req.getFirstName());
        employee.setLastName(req.getLastName());
        Employee savedEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
