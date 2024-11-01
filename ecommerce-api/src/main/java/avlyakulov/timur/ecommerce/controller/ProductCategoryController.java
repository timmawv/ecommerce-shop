package avlyakulov.timur.ecommerce.controller;

import avlyakulov.timur.ecommerce.dto.ProductCategoryResponse;
import avlyakulov.timur.ecommerce.dto.ProductResponse;
import avlyakulov.timur.ecommerce.service.ProductCategoryService;
import avlyakulov.timur.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
@CrossOrigin(origins = "${app.cors.allowedOrigins}")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    private final ProductService productService;

    @GetMapping
    public List<ProductCategoryResponse> findAll() {
        return productCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public List<ProductResponse> findProductsByCategory(@PathVariable("id") Long categoryId) {
        return productService.findAllByCategoryId(categoryId);
    }
}