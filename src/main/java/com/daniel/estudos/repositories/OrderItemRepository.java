package com.daniel.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.estudos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
