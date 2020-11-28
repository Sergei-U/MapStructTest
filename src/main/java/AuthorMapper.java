import org.mapstruct.Mapper;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
@Mapper
public interface AuthorMapper {


    AuthorDto entityToDto(Author entity);

    Author dtoToEntity(AuthorDto dto);
}
