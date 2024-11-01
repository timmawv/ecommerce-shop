package avlyakulov.timur.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductCategoryResponse {

    private Long id;

    private String categoryName;
}
