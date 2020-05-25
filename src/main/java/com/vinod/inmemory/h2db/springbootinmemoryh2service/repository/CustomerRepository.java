package com.vinod.inmemory.h2db.springbootinmemoryh2service.repository;

import com.vinod.inmemory.h2db.springbootinmemoryh2service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
