package net.salma.inventoryservice.repository;

import net.salma.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String > {
}
