package com.example.jpawithrest.product.model;

import com.example.jpawithrest.orderline.model.OrderLine;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  private String name;

  @JsonBackReference
  @OneToMany(mappedBy = "product")
  private List<OrderLine> orderLines;

  public Product(String name) {
    this.name = name;
  }
}