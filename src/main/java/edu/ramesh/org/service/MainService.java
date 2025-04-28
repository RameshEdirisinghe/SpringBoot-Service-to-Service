package edu.ramesh.org.service;

import edu.ramesh.org.dto.Product;

import java.util.List;

public interface MainService {

    List<Product> getProduct();
    Product createProduct(Product product);
}
