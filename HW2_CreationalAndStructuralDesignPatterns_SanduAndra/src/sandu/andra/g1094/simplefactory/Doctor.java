package sandu.andra.g1094.simplefactory;

public class Doctor {
	
	String doctorName;
	AbstractDoctorSpecialization doctorSpecialization;	
	int yearsOfExperience;
	
	public Doctor(String doctorName, AbstractDoctorSpecialization doctorSpecialization, int yearsOfExperience) {
		super();
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;	
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public AbstractDoctorSpecialization getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(AbstractDoctorSpecialization doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorSpecialization=" + doctorSpecialization
				+ ", yearsOfExperience=" + yearsOfExperience + "]";
	}

	
	
   
	
}
