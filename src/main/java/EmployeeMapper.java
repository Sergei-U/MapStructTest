import org.mapstruct.Mapper;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
@Mapper
public interface EmployeeMapper {
    Employee employee(EmployeeDto employeeDto);
    EmployeeDto employeeDto(Employee employee);
}
