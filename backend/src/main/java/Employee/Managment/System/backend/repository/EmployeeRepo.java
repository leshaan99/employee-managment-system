package Employee.Managment.System.backend.repository;

import Employee.Managment.System.backend.entity.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
