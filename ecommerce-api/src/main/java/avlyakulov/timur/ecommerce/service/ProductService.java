package avlyakulov.timur.ecommerce.service;

import avlyakulov.timur.ecommerce.dto.ProductResponse;
import avlyakulov.timur.ecommerce.entity.Product;
import avlyakulov.timur.ecommerce.mapper.ProductMapper;
import avlyakulov.timur.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public List<ProductResponse> findAll(Long categoryId) {
        if (categoryId == null) {
            List<Product> products = productRepository.findAll();
            return productMapper.toResponseList(products);
        } else {
            List<Product> productsByCategory = findCategoryById(categoryId);
            return productMapper.toResponseList(productsByCategory);
        }
    }

    private List<Product> findCategoryById(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
