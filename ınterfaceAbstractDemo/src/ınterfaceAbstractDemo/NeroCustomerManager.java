package ýnterfaceAbstractDemo;

public class NeroCustomerManager extends BaseCustomerManager {
	
	 @Override
	    public void Save(Customer customer) {
	        System.out.println(customer.getFirstName() + " is saved to db (NERO)");
	    }
}
