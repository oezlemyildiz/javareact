package business.abstratcts;

import java.rmi.RemoteException;

import entities.concretes.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws NumberFormatException, RemoteException;

}
