package springXMLInjection;

public class CustomerManager implements ICustomerService{
	
	//Dependency injection
	private ICustomerDal customerDal;
	
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	
	//setter injection but using constructor injection is better
	/*	
	public void setCustomerDal(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	}
	*/

	public void add() {
		
		// business codes here
		customerDal.add();
	}

}
