package sandu.andra.g1094.composite;

public class AttendingPhysician implements DoctorInterface{

	private long id;
	private String name;
	private final String level;
	private int yearsOfExperience;
	
	public AttendingPhysician(long id, String name, int yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.level = "Attending Physician";
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void getDoctorAccountDetails() {
		System.out.println("The doctor with the id "+ this.id + " named " + this.name + " has the level of " + this.level +
				" and " + this.yearsOfExperience + " years of experience.");
		
	}


}
