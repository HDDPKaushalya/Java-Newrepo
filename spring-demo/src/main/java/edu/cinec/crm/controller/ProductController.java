package edu.cinec.crm.controller;

import edu.cinec.crm.model.Product;
import edu.cinec.crm.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @GetMapping("/products")
    Product callMyCode() {
        ProductService service = new ProductService();
        Product product = service.getProduct();
        System.out.println(product);
        return product;
    }

    @GetMapping("/calculate/{numberOne}/{numberTwo}")
    int calculate(@PathVariable int numberOne,
                  @PathVariable int numberTwo) {
        int total = numberOne + numberTwo;
        return  total;
    }

}
