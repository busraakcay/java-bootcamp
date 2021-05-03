package interfaces2;

public class CustomerManagerDal {
	private CustomerDal customerDal;
	
	public CustomerManagerDal(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
		
	public void add() {
		customerDal.add();
	}
}
