package avlyakulov.timur.ecommerce.controller;

import avlyakulov.timur.ecommerce.dto.ProductResponse;
import avlyakulov.timur.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
@CrossOrigin(origins = "${app.cors.allowedOrigins}")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> findAll(@RequestParam(value = "categoryId", required = false) Long categoryId) {
        return productService.findAll(categoryId);
    }
}