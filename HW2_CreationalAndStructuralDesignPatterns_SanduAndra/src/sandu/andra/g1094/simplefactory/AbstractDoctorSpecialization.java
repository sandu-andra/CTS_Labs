package sandu.andra.g1094.simplefactory;

public abstract class AbstractDoctorSpecialization {

	protected int numberOfDoctors;
	protected String aboutSpecialization;

	public String getAboutSpecialization() {
		return aboutSpecialization;
	}

	public void setAboutSpecialization(String aboutSpecialization) {
		this.aboutSpecialization = aboutSpecialization;
	}

	public int getNumberOfDoctors() {
		return numberOfDoctors;
	}

	public void setNumberOfDoctors(int numberOfDoctors) {
		this.numberOfDoctors = numberOfDoctors;
	}
	
	@Override
	public String toString() {
		return "Details about specialization [numberOfDoctors=" + numberOfDoctors + ", aboutSpecialization="
				+ aboutSpecialization + "]";
	}

	public abstract void addNewDoctorForThisSpecialization();
	
	public abstract void removeDoctorForThisSpecialization();
}
