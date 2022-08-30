package com.example.jpawithrest.orderline.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {

  Optional<OrderLine> findById(long id);
}