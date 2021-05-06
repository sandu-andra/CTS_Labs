package sandu.andra.g1094.flyweight;

public class Endocrinologist implements PatientInterface{

	private String doctorName;
	private String patientName;
	private final String Specialization;
	
	public Endocrinologist(String doctorName) {
		this.doctorName = doctorName;
		Specialization = "EndocrinologY";
	}
	

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	@Override
	public void consultation() {
		System.out.println("The patient"+ this.patientName +" is consulted inside the " + Specialization + " department by doctor "+this.doctorName);
		
	}

	@Override
	public void getDoctorForConsultation(String doctorName) {	
		this.doctorName = doctorName;
	}


	@Override
	public void getPatientName(String patientName) {
		this.patientName = patientName;
		
	}

}
