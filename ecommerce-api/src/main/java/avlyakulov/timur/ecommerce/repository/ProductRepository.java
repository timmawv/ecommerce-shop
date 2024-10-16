package avlyakulov.timur.ecommerce.repository;

import avlyakulov.timur.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}