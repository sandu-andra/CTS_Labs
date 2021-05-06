package sandu.andra.g1094;

import java.util.List;

import sandu.andra.g1094.adapter.Admin;
import sandu.andra.g1094.adapter.AdminActions;
import sandu.andra.g1094.adapter.Pharmacist;
import sandu.andra.g1094.adapter.PharmacistAdapter;
import sandu.andra.g1094.builder.DoctorB;
import sandu.andra.g1094.composite.AttendingPhysician;
import sandu.andra.g1094.composite.DoctorsComposite;
import sandu.andra.g1094.composite.Fellow;
import sandu.andra.g1094.composite.HeadOfDepartment;
import sandu.andra.g1094.composite.MedicalStudent;
import sandu.andra.g1094.decorator.Appointment;
import sandu.andra.g1094.decorator.AppointmentCardiologyDecorator;
import sandu.andra.g1094.decorator.AppointmentDermatologyDecorator;
import sandu.andra.g1094.decorator.DoctorApp;
import sandu.andra.g1094.flyweight.PatientFactory;
import sandu.andra.g1094.flyweight.PatientInterface;
import sandu.andra.g1094.prototype.Patient;
import sandu.andra.g1094.proxy.ClinicInternetArea;
import sandu.andra.g1094.proxy.ProxyInternet;
import sandu.andra.g1094.simplefactory.Doctor;
import sandu.andra.g1094.simplefactory.DoctorSpecializationFactory;
import sandu.andra.g1094.simplefactory.DoctorSpecializationType;
import sandu.andra.g1094.singleton.ClinicCEO;

public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {

		//TESTING THE SINGLETON
		System.out.println();
		System.out.println("--------------------------SINGLETON------------------------------");
		
		ClinicCEO clinicCEO1 = ClinicCEO.getClinicCEO();
		System.out.println(clinicCEO1);
		
		ClinicCEO clinicCEO2 = ClinicCEO.getClinicCEO();
		System.out.println(clinicCEO2);
		
		if(clinicCEO1 == clinicCEO2) {
			System.out.println("The output of both objects is the same! This is a Singleton!");
		}
		
		//TESTING SIMPLE FACTORY
		System.out.println();
		System.out.println("----------------------SIMPLE FACTORY-----------------------------");
		
		Doctor doctor1 = new Doctor("Andrew Lawren",
				DoctorSpecializationFactory.getDoctorSpecialization(DoctorSpecializationType.Cardiology),10);
		doctor1.setYearsOfExperience(14);
		doctor1.setDoctorSpecialization(DoctorSpecializationFactory.getDoctorSpecialization(DoctorSpecializationType.Dermatology));
		System.out.println(doctor1.toString());
		
		//TESTING THE BUILDER
		System.out.println();
		System.out.println("---------------------------BUILDER-------------------------------");
		
		DoctorB doctorBuilder1 = new DoctorB.DoctorBuilder(1,"Maria Popescu")
				.isMale()
				.setAddress("Bucuresti")
				.setSpecialization("Dermatology")
				.setLevel("Fellow")
				.build();
		
	   System.out.println(doctorBuilder1.getName());
	   System.out.println(doctorBuilder1.isMale());
	   System.out.println(doctorBuilder1.getSpecialization());
	   
	 //TESTING THE PROTOTYPE
	   System.out.println();
	   System.out.println("---------------------------PROTOTYPE-------------------------------");
	   
	   Patient patient1 = new Patient();
	   patient1.addPatientToList();
	   
	   Patient patient2 = new Patient();
	   patient2.addPatientToList();
	   
	   Patient patient3 = (Patient) patient1.clone();
	   Patient patient4 = (Patient) patient3.clone();
	   
	   List<String> patientList = patient4.getPatientsList();
	   patientList.add("Mara Serban");
	   patientList.remove(2);
	   System.out.println(patientList);
	   
	 //TESTING THE DECORATOR
	   System.out.println();
	   System.out.println("---------------------------DECORATOR-------------------------------");

	   DoctorApp cardiologyAppointment1 = new AppointmentCardiologyDecorator(new Appointment());
	   cardiologyAppointment1.consultPatient();
	   cardiologyAppointment1.addPriceForConsultation(250);
	   cardiologyAppointment1.addPrescription("Blood tests are necessary for the prescription.");
	   cardiologyAppointment1.examineBloodTestResults("Good results");
	   System.out.println();
	   
	   
	   DoctorApp dermatologyAppointment1 = new AppointmentDermatologyDecorator(new Appointment());
	   dermatologyAppointment1.consultPatient();
	   dermatologyAppointment1.addPriceForConsultation(180);	
	   dermatologyAppointment1.hospitalizePatient();
	   System.out.println();
	   
	   DoctorApp dermaAndCardioAppointment = new AppointmentDermatologyDecorator(new AppointmentCardiologyDecorator(new Appointment()));
	   dermaAndCardioAppointment.consultPatient();
	   System.out.println();
	   
	   //TESTING THE ADAPTER
	   System.out.println();
	   System.out.println("---------------------------ADAPTER--------------------------------");
       
	   Pharmacist pharamcist = new Pharmacist();
	   AdminActions adminActions = new Admin();
	   
	   AdminActions pharmacistAdapter = new PharmacistAdapter(pharamcist);
	   
	   adminActions.addMedicalProduct();
	   adminActions.deleteMedicalProduct();
	   
	   pharamcist.updateMedicalProductName();
	   pharamcist.updateMedicalProductQuantity();
	   
	   pharmacistAdapter.addMedicalProduct();
	   pharmacistAdapter.deleteMedicalProduct();
	   
	 //TESTING THE PROXY
	   System.out.println();
	   System.out.println("---------------------------PROXY--------------------------------");
       
	   ClinicInternetArea internetAccess1 = new ProxyInternet("pharmacist Ioana Apostol",3);
	   internetAccess1.getInternetConnection();
	   
	   ClinicInternetArea internetAccess2 = new ProxyInternet("patient Iulia Maria",4);
	   internetAccess2.getInternetConnection();
	   
	   //TESTING THE FLYWEIGHT
	   System.out.println();
	   System.out.println("---------------------------FLYWEIGHT--------------------------------");
       
	   PatientInterface patientint1 = PatientFactory.getPatient("Gastroenterology");
	   patientint1.consultation();
	   PatientInterface patientint2 = PatientFactory.getPatient("Cardio");
	
	 //TESTING THE COMPOSITE
	   System.out.println();
	   System.out.println("---------------------------COMPOSITE--------------------------------");
       
	   DoctorsComposite doctorsList = new DoctorsComposite();
	   
	   MedicalStudent medicalStudent1 = new MedicalStudent(1,"George Ionescu",1);
	   medicalStudent1.getDoctorAccountDetails();
	   doctorsList.hireNewDoctor(medicalStudent1);
	   
	   AttendingPhysician attendingPhysician2 = new AttendingPhysician(2,"Mara Ene",5);
	   attendingPhysician2.getDoctorAccountDetails();
	   doctorsList.hireNewDoctor(attendingPhysician2);
	
	   Fellow fellow3 = new Fellow(3,"Andrei Georgescu",10);
	   fellow3.getDoctorAccountDetails();
	   doctorsList.hireNewDoctor(fellow3);
	     
	   HeadOfDepartment headOfDepartment4 = new HeadOfDepartment(4,"Andrei Georgescu",25);
	   headOfDepartment4.getDoctorAccountDetails();
	   doctorsList.hireNewDoctor(headOfDepartment4);
	   
	   
	}

}
