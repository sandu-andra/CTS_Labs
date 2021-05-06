package sandu.andra.g1094.adapter;

public class Admin implements AdminActions{

	@Override
	public void addMedicalProduct() {
		 System.out.println("Admin added a new medical product");		
	}

	@Override
	public void deleteMedicalProduct() {
		 System.out.println("Admin deleted the medical product");
	}

}
