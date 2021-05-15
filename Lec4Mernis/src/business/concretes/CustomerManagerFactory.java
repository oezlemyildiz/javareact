package business.concretes;

import core.concretes.CustomerCheckManagerAdapter;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerManagerFactory {
	public CustomerManager createNeroCustomerManager() {
		return new NeroCustomerManager();
	}
	
	public CustomerManager createStarbucksCustomerManager() {
		KPSPublicSoapProxy soapProxy = new KPSPublicSoapProxy();
		return new StarbucksCustomerManager(new CustomerCheckManagerAdapter(soapProxy));
	}
	
}
