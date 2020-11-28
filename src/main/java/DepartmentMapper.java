import org.mapstruct.Mapper;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
@Mapper
public interface DepartmentMapper {
    Department dtoToDepartment(DepartmentDto departmentDto);
    DepartmentDto departmentToDto(Department department);
}
