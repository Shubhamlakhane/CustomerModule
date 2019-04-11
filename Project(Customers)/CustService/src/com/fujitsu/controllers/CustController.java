package com.fujitsu.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fujitsu.beans.Customer;
import com.fujitsu.exception.ServiceException;
import com.fujitsu.services.CustomerService;


@Controller
public class CustController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public String viewAllCustomers(HttpSession session)
	{
		try {
			List<Customer> 	customers=customerService.findAllCustomer();
			session.setAttribute("customerList",customers);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "customerview";
	}
	
	@GetMapping("/add")
	public String customeraddForm()
	{
		return "custreg";
	}
	
	@PostMapping("/addCustomer")
	public String addCustomer(Customer customer,ModelMap map)
	{
		try {
			customerService.add(customer);
			map.addAttribute("message","Customer "+customer.getCustomer_Id()+" is added successfully");
			return "popnewreg";

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("customeradderror","Sorry!  could not be added ");
			return "custreg";

		}
		
	}
	
	//Request Mapping
	@GetMapping("/edit")
	public String editCustomer() {
		return "customeredit";
	}
	
	@PostMapping("/editCustomer")
	public String editCustomer(Customer customer,ModelMap map)
	{
		try {
			customerService.update(customer);
			map.addAttribute("message","Customer"+customer.getCustomer_Id()+" is updated successfully");
			return "popnewreg";

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("customerediterror","Sorry! Data could not be saved ");
			return "customeredit";

		}
		
	}
	
	@GetMapping("/delete")
	public String deleteCustomerForm() {
		return "customerdelete";
	}
	
	@PostMapping("/deleteCustomer")
	public String deleteCustomer(Customer customer,ModelMap map)
	{
		try {
			customerService.remove(customer);
			map.addAttribute("message","Customer "+customer.getCustomer_Id()+" is deleted successfully");
			return "popnewreg";

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("customerdeleteerror","Sorry! Data could not be deleted ");
			return "customerdelete";

		}
		
	}
}
