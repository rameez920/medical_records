package arif.nyit.patientData;




public class Patient {
	
	protected String name;
	protected String patientID;
	protected String address;
	
	protected int height; //(inches)
	protected double weight;

	protected Date birthDate;
	protected Date initialVisit;
	protected Date lastVisit;
	
	
	
	
	
	public Patient(String name, String patientID, String address, int height,
			double weight, Date birthDate, Date initialVisit, Date lastVisit) {
		
		this.name = name;
		this.patientID = patientID;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.birthDate = birthDate;
		this.initialVisit = initialVisit;
		this.lastVisit = lastVisit;
	}
	
	public boolean equals(String patientID) {
		return this.patientID.equals(patientID);
	}

	// need to account for month and day
	public int getAge() {
		return new Date().getYear() - birthDate.getYear();
	}
	
	public int getTimeAsPatient() {
		return new Date().getYear() - initialVisit.getYear();
	}
	
	public int getTimeSinceLastVisit() {
		return new Date().getYear() - lastVisit.getYear();
	}
	
	public boolean isOverDue() {
		return (getTimeSinceLastVisit() >= 3);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setInitialVisit(Date initialVisit) {
		this.initialVisit = initialVisit;
	}

	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}

	public String getName() {
		return name;
	}
	
	public String getPatientID() {
		return patientID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public  Date getBirthDate() {
		return birthDate;
	}
	
	public Date getInitialVisit() {
		return initialVisit;
	}
	
	public Date getLastVisit() {
		return lastVisit;
	}
	
	public void printInfo() {
		if (isOverDue()) {
			System.out.println(this.name);
			System.out.println(this.patientID);
			System.out.println(this.address);
			System.out.println(this.height);
			System.out.println(this.weight);
			System.out.println(this.birthDate.toString());
			System.out.println(this.initialVisit.toString());
			System.out.println(this.lastVisit.toString());
			System.out.println("Patient is overdue for appointment");
		} else {
			System.out.println(this.name);
			System.out.println(this.patientID);
			System.out.println(this.address);
			System.out.println(this.height);
			System.out.println(this.weight);
			System.out.println(this.birthDate.toString());
			System.out.println(this.initialVisit.toString());
			System.out.println(this.lastVisit.toString());
		}
		
	}
	
	public String toString() {
		return "Name: " + this.name + " " + "ID:" + this.patientID;
	}
	

}
