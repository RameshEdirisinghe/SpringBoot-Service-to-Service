package edu.ramesh.org.service.Impl;

import edu.ramesh.org.dto.Product;
import edu.ramesh.org.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Product> getProduct() {
        Product[] response = restTemplate
                .getForObject("https://fakestoreapi.com/products",Product[].class);
        return Arrays.stream(response).toList();
    }

    @Override
    public Product createProduct(Product product) {
        return restTemplate.postForObject(
                "https://fakestoreapi.com/products",
                product,
                Product.class
        );
    }
}
