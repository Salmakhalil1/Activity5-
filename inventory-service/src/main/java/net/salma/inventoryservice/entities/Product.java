package net.salma.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @AllArgsConstructor @NoArgsConstructor @Builder @ToString @Getter @Setter
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private double  quantity;
}
