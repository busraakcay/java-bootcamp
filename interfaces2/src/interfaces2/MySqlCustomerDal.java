package interfaces2;

//public class MySqlCustomerDal extends CustomerManagerDal implements CustomerDal, Repository{
public class MySqlCustomerDal implements CustomerDal, Repository{

	@Override
	public void add() {
		System.out.println("My sql eklendi");
	}

}
