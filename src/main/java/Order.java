import lombok.*;

/**
 * @author Sergei Usov
 * @version 1.0.0
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
    @NonNull
    @EqualsAndHashCode.Include
    private String innerNumber;
    @NonNull
    @EqualsAndHashCode.Include
    private String salesNumber;

    private Double sum;

    private Integer itemCount;

}

