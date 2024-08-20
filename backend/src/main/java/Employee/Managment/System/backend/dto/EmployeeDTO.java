package Employee.Managment.System.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private Integer empId;
    private String empName;
    private String empAddress;
    private Integer empMNum;
}
