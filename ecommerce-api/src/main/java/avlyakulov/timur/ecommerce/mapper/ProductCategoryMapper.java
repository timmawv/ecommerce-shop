package avlyakulov.timur.ecommerce.mapper;

import avlyakulov.timur.ecommerce.dto.ProductCategoryResponse;
import avlyakulov.timur.ecommerce.entity.ProductCategory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {

    ProductCategoryResponse toResponse(ProductCategory productCategory);

    List<ProductCategoryResponse> toResponseList(List<ProductCategory> productCategoryList);
}
