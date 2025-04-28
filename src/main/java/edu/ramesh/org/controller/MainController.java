package edu.ramesh.org.controller;

import edu.ramesh.org.dto.Product;
import edu.ramesh.org.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/MainController")
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/get")
    public ResponseEntity<List<Product>> getProduct(){
        List<Product> products = mainService.getProduct();

        if (products != null){
            return new ResponseEntity<>(products, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return mainService.createProduct(product);
    }
}
