package com.example.jpawithrest.product.model;

import com.example.jpawithrest.order.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ProductRepository extends CrudRepository<Product, Long> {

  Optional<Order> findById(long id);
}