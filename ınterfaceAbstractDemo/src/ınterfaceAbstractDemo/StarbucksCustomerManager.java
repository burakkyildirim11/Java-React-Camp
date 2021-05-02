package ýnterfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager  {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (customerCheckService.CheckIfRealPerson(customer)) {
            System.out.println("Starbucks customer added");
            super.Save(customer);
        }
        else System.out.println(customer.getFirstName() + " is not a valid person.");
    }



	
}
