package ro.ase.csie.cts.g1094.refactor.phase2;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;

public class Product {
      public static final int	MAX_AGE_ACCOUNT=10;
      public static final float MAX_FIDELITY_DISCOUNT= 0.15f;

      private static float getDiscountValue(float price, float discount) {
	         return discount * price;
      }
      
      private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount) {
	        return (price - discountValue) - fidelityDiscount * (price - discountValue);
      }

      private static float getFidelityDiscount(int accountAge){
	        return (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
      }

     private static float getFinalPrice(float price, float fidelityDiscount, ProductType type) {
    	 
	      float discountValue=getDiscountValue(price, type.getDiscount());
	      float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
	      return finalPrice;
      }
	
     public float computePriceWithDiscount(ProductType productType, float initialPrice, int accountAge) throws InvalidAgeException, InvalidPriceException {
		  
    	 if(initialPrice<=0) {
			throw new InvalidPriceException();
		 }
    	 
		 if(accountAge<=0) {
			throw new InvalidAgeException();
		 }
		 
	    float finalPrice = 0;
	    
	    float fidelityDiscount = (productType==ProductType.NEW) ? 0:getFidelityDiscount(accountAge);
	    
	    finalPrice=getFinalPrice(initialPrice,fidelityDiscount, productType );
	    
	    return finalPrice;
	  }
}