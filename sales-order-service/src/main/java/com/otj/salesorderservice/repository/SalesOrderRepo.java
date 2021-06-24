package com.otj.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otj.salesorderservice.model.SalesOrder;

@Repository
public interface SalesOrderRepo extends JpaRepository<SalesOrder, Long> {

}
