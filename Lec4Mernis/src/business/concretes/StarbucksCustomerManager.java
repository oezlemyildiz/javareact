package business.concretes;

import java.rmi.RemoteException;

import core.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class StarbucksCustomerManager  extends CustomerManager {
	
	private CustomerCheckService customercheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customercheckService) {
		super();
		this.customercheckService = customercheckService;
	}
	
	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		// TODO Auto-generated method stub
		if(customercheckService.CheckIfRealCustomer(customer)==true) {
		System.out.println("Database kaydedildi");
		} else
		System.out.println("not a valid person");
	}
}