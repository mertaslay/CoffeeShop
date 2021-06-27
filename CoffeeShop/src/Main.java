import java.time.LocalDate;


import CoffeeShop.business.abstracts.BaseCustomerManager;

import CoffeeShop.business.concretes.NeroCustomerManager;

import CoffeeShop.business.concretes.StarbucksCustomerManager;

import CoffeeShop.entities.concretes.Customer;
//import CoffeeShop.adapters.CustomerCheckService;
import CoffeeShop.adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args)  {
		
		
		
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Mert");
        customer.setLastName("Aslay");
        customer.setDateOfBirth(LocalDate.of(2000,1,5));
        customer.setNationalityIdentity("190719078");
      
       
        
        
        BaseCustomerManager customerNero = new NeroCustomerManager();
        customerNero.Save(customer);
        
        BaseCustomerManager customerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerStarbucks.Save(customer);
	}

}
