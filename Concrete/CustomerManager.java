package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " add");
			
		}else {
			System.out.println("Not a valid person");
		}	
		
	}

	@Override
	public void delete(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " delete");
			
		}else {
			System.out.println("Not a valid person");
		}	
		
	}

	@Override
	public void update(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " update");
			
		}else {
			System.out.println("Not a valid person");
		}	
		
	}

	
	private CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
}
