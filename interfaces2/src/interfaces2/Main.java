package interfaces2;

public class Main {

	public static void main(String[] args) {
		CustomerManagerDal customerManagerDal = new CustomerManagerDal(new OracleCustomerDal());
		//customerManagerDal.customerDal = new OracleCustomerDal();
		customerManagerDal.add();

	}

}
