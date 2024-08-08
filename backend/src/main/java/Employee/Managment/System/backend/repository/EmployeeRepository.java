package Employee.Managment.System.backend.repository;

import Employee.Managment.System.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
