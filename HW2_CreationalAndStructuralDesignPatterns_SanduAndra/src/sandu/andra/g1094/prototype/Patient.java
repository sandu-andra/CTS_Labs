package sandu.andra.g1094.prototype;

import java.util.ArrayList;
import java.util.List;


public class Patient implements Cloneable{

	private List<String> patientsList = new ArrayList<String>();
		
	public Patient(List<String> patientsList) {
		this.patientsList = patientsList;
	}
	
	public void addPatientToList() {
		patientsList.add("John Doe");
		patientsList.add("Marlyn Anne");
		patientsList.add("Gabriel Andrew");
	}

	public List<String> getPatientsList() {
		return patientsList;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		List<String> cloneList = new ArrayList<String>();
		
		for(String patient : this.getPatientsList()) {
			cloneList.add(patient);
		}
		
		return new Patient(cloneList);
	}
	
	public Patient() {

	}	
	
}
