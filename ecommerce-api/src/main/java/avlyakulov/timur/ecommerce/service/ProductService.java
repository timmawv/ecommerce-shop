package avlyakulov.timur.ecommerce.service;

import avlyakulov.timur.ecommerce.dto.ProductResponse;
import avlyakulov.timur.ecommerce.entity.Product;
import avlyakulov.timur.ecommerce.mapper.ProductMapper;
import avlyakulov.timur.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public List<ProductResponse> findAll(Long categoryId) {
        if (categoryId == null) {
            List<Product> products = productRepository.findAll();
            return productMapper.toResponseList(products);
        } else {
            return findAllByCategoryId(categoryId);
        }
    }

    public List<ProductResponse> findAllByCategoryId(Long categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId);
        return productMapper.toResponseList(products);
    }

    public List<ProductResponse> findAllBySearchName(String searchName) {
        List<Product> products = productRepository.findAllBySearchName(searchName);
        return productMapper.toResponseList(products);
    }
}