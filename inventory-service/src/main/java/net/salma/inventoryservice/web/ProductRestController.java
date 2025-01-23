package net.salma.inventoryservice.web;

import net.salma.inventoryservice.entities.Product;
import net.salma.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductRestController {
    private ProductRepository productRepository;


    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public List<Product> productList(){
        return productRepository.findAll();

    }
    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id){
        return productRepository.findById(id).get();

    }
}




