package �nterfaceAbstractDemo;

public class MernisCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return customer.getNationalityId().length()==11;
	}

}
