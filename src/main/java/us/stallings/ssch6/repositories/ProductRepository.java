package us.stallings.ssch6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import us.stallings.ssch6.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}