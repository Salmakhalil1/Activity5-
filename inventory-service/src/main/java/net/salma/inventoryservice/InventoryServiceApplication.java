package net.salma.inventoryservice;

import net.salma.inventoryservice.entities.Product;
import net.salma.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.UUID;


@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
  /*  @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().name("Computer").price(2300.0).quantity(12).build());
            productRepository.save(Product.builder().name("Printer").price(2300.0).quantity(12).build());
            productRepository.save(Product.builder().name("Smartphone").price(2300.0).quantity(12).build());


        };
    }


*/
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
       return  args -> {
           productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer").price(100).quantity(5).build());
           productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Printer").price(2300.0).quantity(12).build());
           productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Smartphone").price(2300.0).quantity(12).build());

       };
    }


}
