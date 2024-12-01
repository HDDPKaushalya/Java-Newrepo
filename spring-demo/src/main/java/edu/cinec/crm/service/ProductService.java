package edu.cinec.crm.service;
import edu.cinec.crm.model.Product;

public class ProductService {

    public Product getProduct() {
        Product drinkProduct = new Product();
        drinkProduct.setName("Milo");
        drinkProduct.setDescription("A tasty drink");
        drinkProduct.setPrice(100.0);

        return drinkProduct;
    }
}
