package com.vinod.inmemory.h2db.springbootinmemoryh2service.service;

import com.vinod.inmemory.h2db.springbootinmemoryh2service.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

	Optional<Customer> findCustomerById(Long id);

	List<Customer> getAllCustomers();

	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(Long id);

}
