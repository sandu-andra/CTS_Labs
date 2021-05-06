package sandu.andra.g1094.decorator;

class AppointmentDecorator implements DoctorApp {

	protected DoctorApp doctor;
	
	
	public AppointmentDecorator(DoctorApp doctor) {
		super();
		this.doctor = doctor;
	}

	@Override
	public void consultPatient() {
		this.doctor.consultPatient();
		
	};

	@Override
	public void addPriceForConsultation(float price) {
		this.doctor.addPriceForConsultation(price);		
	}

	@Override
	public void hospitalizePatient() {
		this.doctor.hospitalizePatient();		
	}

	@Override
	public void addPrescription(String prescription) {
		this.doctor.addPrescription(prescription);;			
	}

	@Override
	public void examineBloodTestResults(String bloodTestDesc) {
		this.doctor.examineBloodTestResults(bloodTestDesc);
	}

}
