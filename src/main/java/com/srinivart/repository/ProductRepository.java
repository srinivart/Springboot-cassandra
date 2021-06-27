package com.srinivart.repository;

import com.srinivart.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product,Integer> {
}
