package avlyakulov.timur.ecommerce.mapper;

import avlyakulov.timur.ecommerce.dto.ProductResponse;
import avlyakulov.timur.ecommerce.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductResponse toResponse(Product product);

    List<ProductResponse> toResponseList(List<Product> products);
}
