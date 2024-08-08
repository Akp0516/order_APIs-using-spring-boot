package com.akpgrp.orderapi.repository;

import com.akpgrp.orderapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
