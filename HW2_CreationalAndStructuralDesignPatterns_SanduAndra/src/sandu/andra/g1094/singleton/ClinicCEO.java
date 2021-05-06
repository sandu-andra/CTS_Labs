package sandu.andra.g1094.singleton;

public class ClinicCEO {
	  
	   //STEP 1: Create a private static variable of the ClinicCEO

		private static ClinicCEO clinicCEO;
		String TitleCEO;
		
	   //STEP 2: Create a private constructor
		
		private ClinicCEO() {
			System.out.println("Creating the clinicCEO object...Waiting...");
			this.TitleCEO = "The CEO of Andra's Private Clinic";
		}
		
		//STEP 3: Create the public static method for getting the instance of the class
		//lazy instantiation
		public static ClinicCEO getClinicCEO() {
			if(ClinicCEO.clinicCEO == null) {
				clinicCEO = new ClinicCEO();
			}
			return ClinicCEO.clinicCEO;
		}
		
}
