package com.mash.project_mark_2.services;

import com.mash.project_mark_2.models.Product;
import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductByName(String name)  {
        Product product = productRepository.findByName(name);
        return product;
    }
}
