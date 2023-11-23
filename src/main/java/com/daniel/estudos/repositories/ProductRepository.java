package com.daniel.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.estudos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
