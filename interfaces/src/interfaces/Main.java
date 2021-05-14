package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers=  {new SmsLogger(),new FileLogger(), new EmailLogger()};
		
		CustomerManager customerManager= new CustomerManager(loggers);
		Customer engin = new Customer(1,"Engin","Demirog");
		customerManager.add(engin);

	}

}
