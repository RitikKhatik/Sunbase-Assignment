package sunbase.ty.SunbaseCustApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sunbase.ty.SunbaseCustApp.entity.Customer;
import sunbase.ty.SunbaseCustApp.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping(path="/")
	public String start() {
		return "login";
}
	
	@GetMapping("/loginpg")
	public String login(@RequestParam ("loginid") String loginid, @RequestParam ("loginpassword") String loginpassword) {
		if(loginid.equalsIgnoreCase("test@sunbasedata.com") && loginpassword.equals("Test@123")) {
			return "redirect:available_customer";
	}
		return "login" ;
	}
	
	@GetMapping("/customer_register")
	public String CustomerRegister() {
		return "customerregister";
	}
	
	@GetMapping("/available_customer")
	public ModelAndView GetAllCustomer() {
		List<Customer> list=service.getAllCustomer();
		ModelAndView modelAndView =new  ModelAndView();
		modelAndView.setViewName("customerlist");
		modelAndView.addObject("customer",list);
		return modelAndView;
	}
	
	@PostMapping("/save")
	public String  addCustomer(@ModelAttribute Customer c) {
		service.save(c);
		return "redirect:available_customer";
	}
	
	@RequestMapping("/editCustomer/{id}")
	public String editCustomer(@PathVariable("id") int custID, Model model) {
		Customer c =service.getCustomerId(custID);
		model.addAttribute("customer", c);
		return"customeredit";
		 
	}
	@RequestMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id ) {
		service.deleteById(id);
		return "redirect:/available_customer";
		
	}
	
	@GetMapping("/findById")
	public ModelAndView FindById(@RequestParam("custID") int custID) {
		Customer c=service.findById(custID);
		ModelAndView modelAndView =new  ModelAndView();
		modelAndView.setViewName("customerlist");
		modelAndView.addObject("customer",c);
		return modelAndView;
	}
	


}
