package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// inject the Customer service into the controller
	@Autowired
	private CustomerService customerService;
	 
	// only accepts get http request and rejects the other type of request
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get the customers from the DAO
		List<Customer> theCustomers = customerService.getCustomers();
		
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showformForAdd(Model theModel) {
		 
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the customer using the service
		customerService.saveCustomer(theCustomer);

		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model theModel) {
		
		// get the customer from the service
		Customer theCustomer = customerService.getCustomer(theId);
		
		// set the customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer",theCustomer);
		
		// send over to or form
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int theId) {
		
		// delete the customer 
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
	}

	@GetMapping("/showSearchForm")
	public String searchForm(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "search-form";
	}
	
	@PostMapping("/searchCustomer")
	public String searchCustomer(@RequestParam("customerId") int theId,
									Model theModel) {
		
		Customer theCustomer = customerService.getCustomer(theId);
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-details";
	}
	
}

