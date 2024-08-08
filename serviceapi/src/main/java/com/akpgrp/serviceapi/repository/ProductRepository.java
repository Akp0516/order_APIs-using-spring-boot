package com.akpgrp.serviceapi.repository;

import com.akpgrp.serviceapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
