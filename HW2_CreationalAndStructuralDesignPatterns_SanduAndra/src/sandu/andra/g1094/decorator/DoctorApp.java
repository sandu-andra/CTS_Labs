package sandu.andra.g1094.decorator;

public interface DoctorApp {
		
	public abstract void consultPatient();
	public abstract void addPriceForConsultation(float price);
	public abstract void hospitalizePatient();
	public abstract void addPrescription(String prescription);
	public abstract void examineBloodTestResults(String bloodTestDesc);
}
