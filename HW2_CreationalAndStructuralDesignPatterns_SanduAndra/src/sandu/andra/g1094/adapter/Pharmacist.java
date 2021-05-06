package sandu.andra.g1094.adapter;

public class Pharmacist implements InventoryPharmacist {

	@Override
	public void updateMedicalProductName() {
		System.out.println("The pharmacist updated the product name");
	}

	@Override
	public void updateMedicalProductQuantity() {
		System.out.println("The pharmacist updated the product quantity");
	}


	
}
