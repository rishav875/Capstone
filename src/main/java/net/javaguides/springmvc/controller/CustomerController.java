package net.javaguides.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springmvc.entity.Customer;
import net.javaguides.springmvc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public String index() {
		return "redirect:/customer/list";
	}
	@GetMapping("/customer/list")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/customer/showForm")
	public String showFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@PostMapping("/customer/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);	
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model theModel) {
		Customer theCustomer = customerService.getCustomer(theId);	
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@GetMapping("/customer/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
}
