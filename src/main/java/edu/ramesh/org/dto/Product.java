package edu.ramesh.org.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
}
