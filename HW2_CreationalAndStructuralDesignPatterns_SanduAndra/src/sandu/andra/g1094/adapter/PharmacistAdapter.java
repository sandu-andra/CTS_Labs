package sandu.andra.g1094.adapter;

public class PharmacistAdapter implements AdminActions {

	Pharmacist pharmacist;

	public PharmacistAdapter(Pharmacist pharmacist) {
		super();
		this.pharmacist = pharmacist;
	}

	
	@Override
	public void addMedicalProduct() {
		 System.out.println("The pharmacist added new product");
	}

	@Override
	public void deleteMedicalProduct() {
		 System.out.println("The pharmacist deleted the product");
	}
}
