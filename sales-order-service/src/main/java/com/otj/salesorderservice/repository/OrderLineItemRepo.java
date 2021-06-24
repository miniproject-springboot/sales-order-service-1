package com.otj.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otj.salesorderservice.model.OrderLineItem;

@Repository
public interface OrderLineItemRepo extends JpaRepository<OrderLineItem, Long>{

}
