package CoffeeShop.business.concretes;

import CoffeeShop.adapters.CustomerCheckService;

import CoffeeShop.business.abstracts.BaseCustomerManager;

import CoffeeShop.business.abstracts.CustomerService;
import CoffeeShop.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	public NeroCustomerManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Save(Customer customer) {
		System.out.println("Nero Customer Manager: validation successfull. ");
		super.Save(customer);
	}
}


