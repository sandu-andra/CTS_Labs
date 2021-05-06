package sandu.andra.g1094.composite;

import java.util.ArrayList;
import java.util.List;

public class DoctorsComposite implements DoctorInterface{

	private List<DoctorInterface> doctors = new ArrayList<DoctorInterface>();
		
	public void hireNewDoctor(DoctorInterface doctor) {
		doctors.add(doctor);
	}
	
	public void dismissExistingDoctor(DoctorInterface doctor) {
		doctors.remove(doctor);
	}
	
	@Override
	public void getDoctorAccountDetails() {
		for(DoctorInterface doctor : doctors) {
			doctor.getDoctorAccountDetails();
		}
		
	}
	
}
