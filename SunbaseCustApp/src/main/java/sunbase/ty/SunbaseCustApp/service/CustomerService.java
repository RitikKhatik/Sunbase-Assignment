package sunbase.ty.SunbaseCustApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunbase.ty.SunbaseCustApp.entity.Customer;
import sunbase.ty.SunbaseCustApp.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public void save(Customer c) {
		repository.save(c);
		
		
	}
	public List<Customer> getAllCustomer(){
		return repository.findAll();
	} 
	
	public Customer getCustomerId(int id) {
		return repository.findById(id).get();
		
	}
	public void deleteById(int id) {
		repository.deleteById(id);		
	}
	public Customer findById(int id) {
		Optional<Customer> c= repository.findById(id);
		if(c.isPresent()) {
			Customer customer2=c.get();
			return customer2;
			}
		return null;
	}

}
