package core.concretes;

import java.rmi.RemoteException;

import core.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public  class CustomerCheckManagerAdapter  implements CustomerCheckService {
	
	private KPSPublicSoapProxy  kpsPublicSoap;
	
	public CustomerCheckManagerAdapter(KPSPublicSoapProxy kpsPublicSoap) {
		super();
		this.kpsPublicSoap = kpsPublicSoap;
	}

	@Override
	public boolean CheckIfRealCustomer(Customer customer) throws NumberFormatException, RemoteException {
		
		return this.kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.nationality), customer.firstName.toUpperCase(),customer.lastName.toUpperCase(), customer.dateOfBirth);
	}
}
