package sandu.andra.g1094.decorator;

public class AppointmentDermatologyDecorator extends AppointmentDecorator{

	public AppointmentDermatologyDecorator(DoctorApp doctor) {
		super(doctor);
	}

	@Override
	public void consultPatient() {
		super.consultPatient();
		System.out.println("Inside dermatology department.");
	}

	@Override
	public void addPriceForConsultation(float price) {
		super.addPriceForConsultation(price);
		System.out.println("Inside dermatology department.");
	}

	@Override
	public void hospitalizePatient() {
		super.hospitalizePatient();
		System.out.println("Inside dermatology department.");
	}

	@Override
	public void addPrescription(String prescription) {
		super.addPrescription(prescription);
		System.out.println("Inside dermatology department.");
	}

	@Override
	public void examineBloodTestResults(String bloodTestDesc) {
		super.examineBloodTestResults(bloodTestDesc);
		System.out.println("Inside dermatology department.");
	}

	
	
}
