package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.NewConnectionDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ProductServices productServices= new ProductManager(new HibernateProductDao());
		ProductServices productServices= new ProductManager(new NewConnectionDao(),
				new JLoggerManagerAdapter());
			
		Product product = new Product(1,2,"Elma",12,50);
		productServices.add(product);

	}

}
