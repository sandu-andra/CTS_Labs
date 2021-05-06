package sandu.andra.g1094.builder;

public class DoctorB {
	
	//mandatory for a new instance
	long id;
	String name;
	
	//optional
	String email;
	String address;
	String phone;
	boolean isMale;
	String specialization;
	String level;
	String bloodGroup;
	String education;
	
	private DoctorB() {
		
	}


	public DoctorB(long id, String name, String email, String address, String phone, boolean isMale,
			String specialization, String level, String bloodGroup, String education) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.isMale = isMale;
		this.specialization = specialization;
		this.level = level;
		this.bloodGroup = bloodGroup;
		this.education = education;
	}

	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	public String getPhone() {
		return phone;
	}


	public boolean isMale() {
		return isMale;
	}


	public String getSpecialization() {
		return specialization;
	}


	public String getLevel() {
		return level;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public String getEducation() {
		return education;
	}


	public static class DoctorBuilder{
		 
		private DoctorB doctor = null;

		public DoctorBuilder(long id, String name) {
			doctor = new DoctorB();
			doctor.id = id;
			doctor.name = name;			
		}
			
		public DoctorBuilder setEmail(String email) {
			doctor.email = email;
			return this;
		}

		public DoctorBuilder setAddress(String address) {
			doctor.address = address;
			return this;
		}

		public DoctorBuilder setPhone(String phone) {
			doctor.phone = phone;
			return this;
		}

		public DoctorBuilder isMale() {
			doctor.isMale = true;
			return this;
		}

		public DoctorBuilder setSpecialization(String specialization) {
			doctor.specialization = specialization;
			return this;
		}

		public DoctorBuilder setLevel(String level) {
			doctor.level = level;
			return this;
		}

		public DoctorBuilder setBloodGroup(String bloodGroup) {
			doctor.bloodGroup = bloodGroup;
			return this;
		}

		public DoctorBuilder setEducation(String education) {
			doctor.education = education;
			return this;
		}
		
		public DoctorB build() {
			return this.doctor;
		}
			
	}
	

}
