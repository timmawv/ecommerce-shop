package avlyakulov.timur.ecommerce.repository;

import avlyakulov.timur.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.category.id = ?1")
    List<Product> findByCategoryId(Long id);
}