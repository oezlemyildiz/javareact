package core.abstracts;

import java.rmi.RemoteException;

import entities.concretes.Customer;




public interface CustomerCheckService {
	  public  boolean CheckIfRealCustomer (Customer customer) throws NumberFormatException, RemoteException;
}
