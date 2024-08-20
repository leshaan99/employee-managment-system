package Employee.Managment.System.backend.service;

import Employee.Managment.System.backend.dto.EmployeeDTO;
import Employee.Managment.System.backend.repository.EmployeeRepo;
import Employee.Managment.System.backend.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public String saveEmployee(EmployeeDTO employeeDTO){

        if(employeeRepo.existsById(employeeDTO.getEmpId())){
            return VarList.RSP_DUPLICATED;
        }else {
            employeeRepo.save(employeeDTO)
        }
    }
}
