package ýnterfaceAbstractDemo;
import java.util.Calendar;
import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		 	BaseCustomerManager neroCustomerManager = new NeroCustomerManager();

	        // if we want to use both check managers, simply we send an array as parameter.
		 	BaseCustomerManager starbucksCustomManager = new StarbucksCustomerManager(new CustomerCheckManager());
		 	BaseCustomerManager starbucksCustomManager2 = new StarbucksCustomerManager(new MernisCheckManager());

	        Customer customer = new Customer(1,"Burak", "Yildirim", new Date(1999, Calendar.SEPTEMBER, 23), "11110000000");
	        Customer customer2 = new Customer(2,"Engin", "Demirog", new Date(1986, Calendar.JANUARY, 1), "22222000000");

	        System.out.println("-------------------------");
	        neroCustomerManager.Save(customer);
	        neroCustomerManager.Save(customer2);

	        System.out.println("-------------------------");
	        starbucksCustomManager.Save(customer);
	        starbucksCustomManager.Save(customer2);

	        System.out.println("-------------------------");
	        starbucksCustomManager2.Save(customer);
	        starbucksCustomManager2.Save(customer2);
	}

}
