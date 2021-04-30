package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "45678";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(engin);
		
		Customer[] customers = {engin, hepsiBurada};
		customerManager.addMultiple(customers);
	}

}