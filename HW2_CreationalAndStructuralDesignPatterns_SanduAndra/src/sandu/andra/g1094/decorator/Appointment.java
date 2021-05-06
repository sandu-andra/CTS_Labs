package sandu.andra.g1094.decorator;

public class Appointment implements DoctorApp{

	
	public Appointment() {
		super();
	}

	@Override
	public void consultPatient() {
		System.out.println("The patient is consulted");	
	};

	@Override
	public void addPriceForConsultation(float price) {
		System.out.println("The price for the consultation is calculated");
	}

	@Override
	public void hospitalizePatient() {
		System.out.println("The patient is hospitalized");	
	}

	@Override
	public void addPrescription(String prescription) {
		System.out.println("The prescription is written");	
	}

	@Override
	public void examineBloodTestResults(String bloodTestDesc) {
		System.out.println("The blood tests results are analyzed");
	}

}
