package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Customer;
import com.shopping.service.CustomerDaoService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDaoService custService;
	
	@GetMapping("/Customer")
	public List<Customer> getAllCustomer(){
		return custService.getCustomer();
	}
	@PostMapping("/addcustomer")
	public void addCustomerData(@RequestBody Customer customer) {
		custService.addCustomer(customer);
	}
	
	@PutMapping("/updatecustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		custService.updateCustomer(customer);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/deletecustomer/{username}")
	public void deleteCustomer(@PathVariable String username) {
		custService.deleteCustomer(username);
	}
}
