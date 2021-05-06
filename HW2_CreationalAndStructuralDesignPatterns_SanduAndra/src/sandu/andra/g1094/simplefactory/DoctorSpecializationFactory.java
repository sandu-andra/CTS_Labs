package sandu.andra.g1094.simplefactory;

public class DoctorSpecializationFactory {

	public static AbstractDoctorSpecialization getDoctorSpecialization(DoctorSpecializationType doctorSpecializationType) {
		
		AbstractDoctorSpecialization specialization= null;
		
		switch(doctorSpecializationType) {
		case Gastroenterology:
			specialization = new Gastroenterology(7,"Gastroenterology is the branch of medicine focused on the digestive system and its disorders");
			break;
		case Cardiology:
			specialization = new Cardiology(5, "Cardiology is the medical speciality dealing with the diagnosis and treatment of diseases and disorders of the heart.");
		    break;
		case Anesthesiology:
			specialization = new Anesthesiology(10, "The branch of medicine that is focused on the relief of pain in the perioperative period (i.e. before, during or after a surgical procedure) is known as anesthesiology");
		    break;
		case Dermatology:
			specialization = new Dermatology(3, "Dermatology is the branch of medicine dealing with the skin. It is a speciality with both medical and surgical aspects.");
		    break;
	    default:
    		throw new UnsupportedOperationException("Specialization is not added!");
    	}
		return specialization;
	}
}
