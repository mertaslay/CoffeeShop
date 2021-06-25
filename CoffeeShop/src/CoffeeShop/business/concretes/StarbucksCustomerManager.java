package CoffeeShop.business.concretes;

import CoffeeShop.adapters.CustomerCheckService;
import CoffeeShop.business.abstracts.BaseCustomerManager;
import CoffeeShop.entities.concretes.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public void  Save (Customer customer) {
		
		System.out.println("Starbucks Manager : validation successfull.");
		super.Save(customer);
	}
	
 }

