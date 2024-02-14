package edu.neu.anurag;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    private List<Product> products;

    public ProductDB() {
        this.products = new ArrayList<>();
        initializeProducts();
    }

    private void initializeProducts() {
        
        products.add(new ElectronicProduct(1, "Laptop", "Hp Laptop", ProductTypeEnum.ELECTRONICS));
        products.add(new ElectronicProduct(2, "Mobile", "Pixel 8", ProductTypeEnum.ELECTRONICS));
      
        products.add(new ClothingProduct(3, "Levis Tshirt", "Tshirt", ProductTypeEnum.CLOTHING_FASHION));
        products.add(new ClothingProduct(4, "Nike Shoe", "Shoe", ProductTypeEnum.CLOTHING_FASHION));

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

}
