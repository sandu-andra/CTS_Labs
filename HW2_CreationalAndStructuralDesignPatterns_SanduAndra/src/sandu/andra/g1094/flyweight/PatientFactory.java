package sandu.andra.g1094.flyweight;

import java.util.HashMap;

public class PatientFactory {

	private static HashMap<String, PatientInterface> patientMap = new HashMap<String, PatientInterface>();
	
	public static PatientInterface getPatient(String consulationDepartment) {
		
		PatientInterface patient = null;
		
		if(patientMap.get(consulationDepartment) != null) {
			patient = patientMap.get(consulationDepartment);
		}else {
			switch(consulationDepartment) {
			case "Cardiology":
				System.out.println("Patient consulted in Cardiology department");
				patient = new Cardiologist("Ana Popescu");
				patient.getPatientName("Dora Ionescu");
				break;
			case "Dermatology":
				System.out.println("Patient consulted in Dermatology department");
				patient = new Dermatologist("Albert Andrew");
				patient.getPatientName("Dora Ionescu");
				break;
			case "Endocrinology":
				System.out.println("Patient consulted in Endocrinology department");
				patient = new Endocrinologist("Mara Serban");
				patient.getPatientName("Dora Ionescu");
				break;
			case "Gastroenterology":
				System.out.println("Patient consulted in Gastroenterology department");
				patient = new Gastroenterologist("Ioan Alin");
				patient.getPatientName("Dora Ionescu");
				break;
			default:
				System.out.println("Department is not valid or it is not covered yet!");
			}
			patientMap.put(consulationDepartment, patient);
		}
		return patient;
		
	}
}
