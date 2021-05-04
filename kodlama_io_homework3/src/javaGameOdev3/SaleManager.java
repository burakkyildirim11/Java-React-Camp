package javaGameOdev3;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		
		System.out.println(sale.getGame()+" added successfully!");
		
	}

	@Override
	public void delete(Sale sale) {
		
		System.out.println(sale.getGame()+" deleted successfully!");
		
	}

	@Override
	public void update(Sale sale) {
		
		System.out.println(sale.getGame()+" updated successfully!");
		
	}

	
}	
