import java.rmi.RemoteException;

import business.concretes.CustomerManager;
import business.concretes.CustomerManagerFactory;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import core.concretes.CustomerCheckManagerAdapter;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		
		Customer customer= new Customer(1,"Özlem","Yıldız",1986,"23426611612");
		
		CustomerManagerFactory factory = new CustomerManagerFactory();
		
		CustomerManager customerManager = factory.createStarbucksCustomerManager();

		customerManager.save(customer);
	}
}
