package avlyakulov.timur.ecommerce.service;

import avlyakulov.timur.ecommerce.dto.ProductCategoryResponse;
import avlyakulov.timur.ecommerce.entity.ProductCategory;
import avlyakulov.timur.ecommerce.mapper.ProductCategoryMapper;
import avlyakulov.timur.ecommerce.repository.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    private final ProductCategoryMapper productCategoryMapper;

    public List<ProductCategoryResponse> findAll() {
        List<ProductCategory> categories = productCategoryRepository.findAll();
        return productCategoryMapper.toResponseList(categories);
    }
}