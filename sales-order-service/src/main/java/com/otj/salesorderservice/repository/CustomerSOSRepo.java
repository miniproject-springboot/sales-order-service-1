package com.otj.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otj.salesorderservice.model.CustomerSOS;

@Repository
public interface CustomerSOSRepo extends JpaRepository<CustomerSOS, Long> {

}
