package CoffeeShop.adapters;

import java.rmi.RemoteException;


//new Locale için
import java.util.Locale;

import CoffeeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {


	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
		//new Local sistem I'yý farklý algýlamasýn die yazýlýr 
		result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityIdentity()),customer.getFirstName().toUpperCase(new Locale("tr")), 
				customer.getLastName().toUpperCase(new Locale("tr")),customer.getDateOfBirth().getYear());
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
