package business.concretes;

import java.rmi.RemoteException;

import business.abstratcts.CustomerService;
import entities.concretes.Customer;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Database yazıldı" + customer.id);
		
	}

}
