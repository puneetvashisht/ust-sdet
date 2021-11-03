package com.ust.springmongodemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springmongodemo.entities.Customer;
import com.ust.springmongodemo.repos.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	  private CustomerRepository repository;
	
	@GetMapping("/")
	public List<Customer> fetchAllCustomer(){	
		return  repository.findAll();
		
	}
	
	@PostMapping("/")
	public void addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		repository.save(customer);
	}

}
