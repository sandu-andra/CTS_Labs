package ro.ase.csie.cts.g1094.refactor.phase3.test;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.Product;
import ro.ase.csie.cts.g1094.refactor.phase3.ProductType;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Product product = new Product();
		Product product =  new Product(new Marketing2021Strategy());
		
		try {
			float finalPrice = product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
		
			System.out.println("The final price is "+ finalPrice);
		
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
