package com.mash.project_mark_2.repositories;

import com.mash.project_mark_2.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
    Product findByName(String name);
    Product deleteByName(String name);

    Product findProductById(String id);
}
